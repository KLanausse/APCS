/**
 * This program is a playground for practing ArrayLists
 *
 * @author : Kai Lanausse
 * @since : December 2, 2022
 * @version : 1.0
 */
package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) throws FileNotFoundException {
        //get file
        Scanner data = new Scanner(new File("src/Ch10ArrayList/Data/data.txt"));

        //Store all words in file to an ArrayList
        ArrayList list = new ArrayList();
        while (data.hasNextLine()){
            list.add(data.nextLine());
        }

        //print all words
        for (Object word: list)
            System.out.println(word);

        System.out.println();

        //display them with all plurals (ending in "s") capitalized.
        for (Object word: list) {
            System.out.print(word);
            if (!word.toString().endsWith("s"))
                System.out.println("s");
        }

        System.out.println("\n");

        //display them in reverse order.
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(list.size()-1-i));

        System.out.println();

        //display them with all plural words removed.
        for (Object word: list)
            if (!word.toString().endsWith("s"))
                System.out.println(word);
    }
}

