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
            String secretWord = getRandomWordFromList();
            ArrayList<Character> guessedLetters = new ArrayList<Character>();

            System.out.println(secretWord);

            String hiddenWord = hideWord(secretWord, guessedLetters);
            int wrongGuesses = 0;
            do{

                System.out.println(hiddenWord);

                printHangmanState(wrongGuesses);


                System.out.println("Incorrect guesses = "+wrongGuesses);
                System.out.println(guessedLetters);
                System.out.print("Guess a letter: ");
                guessedLetters.add(console.next().toLowerCase().charAt(0));
                System.out.println();

                //Check guessed letter
                if (!containsLetter(secretWord, guessedLetters))
                    wrongGuesses++;

                hiddenWord = hideWord(secretWord,guessedLetters);

            }while (wrongGuesses < 6 && !hiddenWord.equals(secretWord));

            //Game results
            printGameResults(secretWord, hiddenWord, wrongGuesses);
            if ( hiddenWord.equals(secretWord) ) {
                totalWins++;
            }

            System.out.print("Do you want to play again? ");
        }while (console.next().toLowerCase().startsWith("y"));

        //Total Game Statistics
        totalGameStatistics(totalGames, totalWins);
    }

    private static boolean containsLetter(String hiddenWord, ArrayList<Character> guessedLetters) {
        if ( guessedLetters.indexOf(guessedLetters.get(guessedLetters.size()-1)) == guessedLetters.size()-1 ){//Make sure it hasn't already been guessed
            return hiddenWord.indexOf(guessedLetters.get(guessedLetters.size() - 1)) != -1;
        }else{
            guessedLetters.remove(guessedLetters.size()-1);
            System.out.println("You already guessed that letter!");
        }
        return true;
    }

    private static void totalGameStatistics(int totalGames, int totalWins) {
        System.out.println("total games\t= " + totalGames);
        System.out.println("total wins\t= " + totalWins);
        System.out.println("win percentage\t= " + (totalWins/(double)totalGames)*100 );
    }

    private static void printGameResults(String hiddenWord, String displayedWord, int wrongGuesses) {
        if ( displayedWord.equals(hiddenWord) ){
            System.out.println(hiddenWord);
            System.out.print("You won in "+wrongGuesses+" guess");

            if (wrongGuesses==1) {
                System.out.println("es\n");
            }else {
                System.out.println("\n");
            }
        }else {
            printHangmanState(wrongGuesses);
            System.out.println("\nYou lost.\n");
        }
        System.out.println("The word was "+hiddenWord);
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
    public static void printHangmanState(int state){
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

    /**
     * Used to hide the unguessed letters
     * @param word
     * @param guessedWords
     * @return
     */
    public static String hideWord(String word, ArrayList guessedWords){
        //This could be done better lol
        String temp = "";
        for (char letter: word.toCharArray()) {
            if (!guessedWords.contains(letter)){
                temp += '.';
            } else
                temp += letter;
        }

        return temp;
    }



}
