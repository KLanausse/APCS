package Ch8Classes.Projects.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KaiLanausseHangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        int totalGames = 0;
        int totalWins = 0;

        //Game Loop
        do {
            totalGames++;
            String word = getRandomWordFromList();
            ArrayList<Character> guessedWords = new ArrayList<Character>();

            System.out.println(word);
            for (int i = 0; i < word.length(); i++) {

            }

            String temp = "";
            int wrongGuesses = 0;
            while (wrongGuesses < 6 && temp.equals(word)){

                for (char letter: word.toCharArray()) {
                    if (!guessedWords.contains(letter)){
                        temp += '.';
                    } else
                        temp += letter;
                }

                System.out.println(temp);

            }

            System.out.print("Do you want to play again? ");
        }while (console.nextLine().toLowerCase().startsWith("y"));

        //Game statistics
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

    /**
     * Prints ascii art of the based of the state
     * @param state
     */
    public static void printState(int state){
        String[] states = {
                "|\n|\n|",
                "|  O\n|\n|",
                "|  O\n|  |\n|",
                "|  O\n| /|\n|",
                "|  O\n| /|\\\n|",
                "|  O\n| /|\\\n| /",
                "|  O\n| /|\\\n| / \\"
        };

        System.out.println(
                "+--+\n" +
                "|  |");

        System.out.println(states[state]);

        System.out.println(
                "|\n" +
                "+-----");
    }



}
