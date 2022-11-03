/**
 * Version 1: This program will parse a file with responses given by the user and output the results to a file
 * Version 2: This version will brake the program up into methods
 *
 * @author: Kai Lanausse
 * @since: October 26, 2022
 * @version: 2.0
 */
package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class KaiLanaussePersonalityTestV2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner fileInput = getInputFile();

        System.out.print("Output file name: ");
        PrintStream fileOutput = new PrintStream( new File("src/Data/Out/" + console.next()) );//Open the output for writing

        console.close(); //Will no longer be used
        parseData(fileInput, fileOutput);

        //Close and finish
        fileOutput.close();
        fileInput.close();

    }

    public static void parseData(Scanner fileInput, PrintStream fileOutput) {
        char[][] types = {
                {'E', 'I'},
                {'S', 'N'},
                {'T', 'F'},
                {'J', 'P'}
        };

        //Start Parsing data
        while (fileInput.hasNextLine()){
            String name = fileInput.nextLine();
            String answers = fileInput.nextLine().toLowerCase();

            int[] aCount = new int[4];
            int[] bCount = new int[4];

            //Question Response Answers
            for (int question = 0; question < 70; question++) {
                    //System.out.println(( (question%7)+ 1)%8 / 2);
                    if (answers.charAt(question) == 'a'){

                        aCount[ ( (question%7)+ 1)%8 / 2 ]++;

                    }else if (answers.charAt(question) == 'b'){

                        bCount[ ( (question%7)+ 1 )%8 / 2 ]++;

                    }

            }

            int[] bPercent = new int[4];
            for (int i = 0; i < 4 ; i++) {
                bPercent[i] = bCount[i]*100 / (bCount[i]+aCount[i]);
            }

            String type = "";

            //Decide Type
            for (int i = 0; i < 4; i++) {

                if (bPercent[i] < 50) { //Make sure 'A' and 'B' are not the same
                    type += types[i][0];
                }else if(bPercent[i] > 50){
                    type += types[i][1];
                }else { //Mark as 'X' if they are
                    type += 'X';
                }

            }
            writeResults(fileOutput, name, aCount, bCount, bPercent, type);

        }
    }

    public static void writeResults(PrintStream fileOutput, String name, int[] aCount, int[] bCount, int[] bPercent, String type) {
        //Write to output file
        fileOutput.println(name +":");
        for (int i = 0; i < 4; i++) {
            fileOutput.print(aCount[i]+"A-"+bCount[i]+"B ");
        }
        fileOutput.println();
        fileOutput.println("["+bPercent[0]+"%, "+bPercent[1]+"%, "+bPercent[2]+"%, "+bPercent[3]+"%]"+" = "+ type);
        fileOutput.println();
        System.out.println();
    }

    public static Scanner getInputFile() {
        boolean fileExists = false;
        Scanner fileInput = new Scanner("");

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
        return fileInput;
    }
}
