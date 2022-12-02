package Ch8Classes.Projects.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KaiLanausseHangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println(getRandomWordFromList());
    }

    public static String getRandomWordFromList() throws FileNotFoundException {
        String word = "Fallback";
        //Get Word List
        Scanner fileInput = new Scanner(new File("src/Ch8Classes/Projects/Hangman/wordListMIT.txt"));
        //Number of words is known so I believe it's ok to hardcode
        for (int i = 0; i < (int)(Math.random() * 10000); i++) { //Improve randomizer
            if (fileInput.hasNextLine())
                word = fileInput.nextLine();
        }
        fileInput.close();
        return word;
    }
}
