package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class KaiLanaussePersonalityTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner fileInput = new Scanner("");
        boolean fileExists = false;

        System.out.print("Input file name: ");
        do {
            try {
                File file = new File("src/Data/In/" + console.next());
                fileInput = new Scanner(file);
                fileExists = true;
            } catch (FileNotFoundException e) {
                System.out.print("File not found. Try again: ");
            }
        }while ( !fileExists );
        System.out.print("Output file name: ");
        PrintStream fileOutput = new PrintStream( new File("src/Data/Out/" + console.next()) );

        while (fileInput.hasNextLine()){
            String name = fileInput.nextLine();
            String answers = fileInput.nextLine();

            //Write to output file
            fileOutput.println(name +":");
            System.out.println(name);

            //Question Response Answers
            for (int group = 0; group < 10; group++) {
                for (int question = 0; question < 7; question++) {
                    System.out.println("Group: " + (group+1) + ", Question: " + (question+1));
                    System.out.println(question%7);
                    if (answers.charAt(group+question) == 'A'){
                        System.out.println("AYYYY");
                    }else if (answers.charAt(group+question) == 'B'){
                        System.out.println("BEEE");
                    }else {
                        System.out.println("NO ANSWER");
                    }

                }
            }
        }

        fileOutput.close();
        fileInput.close();
        console.close();

    }
}
