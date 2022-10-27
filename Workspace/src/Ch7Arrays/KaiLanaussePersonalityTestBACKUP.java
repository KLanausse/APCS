package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class KaiLanaussePersonalityTestBACKUP {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner fileInput = new Scanner("");
        boolean fileExists = false;

        //Get input file and set output
        System.out.print("Input file name: ");
        do {
            try {
                //File file = new File("src/Data/In/" + console.next()); // personality.txt
                File file = new File("src/Data/In/personality.txt");
                fileInput = new Scanner(file);
                fileExists = true;
            } catch (FileNotFoundException e) {
                System.out.print("File not found. Try again: ");
            }
        }while ( !fileExists );
        System.out.print("Output file name: ");
        PrintStream fileOutput = new PrintStream( new File("src/Data/Out/" + console.next()) );//Open the output for writing

        console.close(); //Will no longer be used

        //Start Parsing data
        while (fileInput.hasNextLine()){
            String name = fileInput.nextLine();
            String answers = fileInput.nextLine().toLowerCase();

            int[] aCount = new int[4];
            int[] bCount = new int[4];

            //Question Response Answers
            for (int group = 0; group < 10; group++) {
                for (int question = 0; question < 7; question++) {

                    if (answers.charAt(group+question) == 'a'){

                        aCount[ (question+ 1)%8 / 2 ]++;

                    }else if (answers.charAt(group+question) == 'b'){

                        bCount[ (question+ 1)%8 / 2 ]++;

                    }

                }
            }

            int[] bPercent = {(bCount[0]*100 / 10), (bCount[1]*100 / 20), (bCount[2]*100 / 20), (bCount[3]*100 / 20)};
            char[][] types = {
                    {'E', 'I'},
                    {'S', 'n'},
                    {'T', 'F'},
                    {'J', 'P'}
            };
            String type = "";

            //Decide Type
            for (int i = 0; i < 4; i++) {

                if (aCount[i] != bCount[i]) { //Make sure 'A' and 'B' are not the same
                    type += types[i][bPercent[i] / 50];
                } else { //Mark as 'X' if they are
                    type += 'X';
                }

            }

            //Write to output file
            fileOutput.println(name +":");
            for (int i = 0; i < 4; i++) {
                fileOutput.print(aCount[i]+"A-"+bCount[i]+"B ");
            }
            fileOutput.println();
            fileOutput.println("["+bPercent[0]+"%, "+bPercent[1]+"%, "+bPercent[2]+"%, "+bPercent[3]+"%]"+" = "+type);
            fileOutput.println();

        }

        //Close and finish
        fileOutput.close();
        fileInput.close();

    }
}
