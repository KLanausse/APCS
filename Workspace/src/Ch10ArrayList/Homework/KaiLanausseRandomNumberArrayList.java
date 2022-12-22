package Ch10ArrayList.Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KaiLanausseRandomNumberArrayList {
    public static void main(String[] args) throws FileNotFoundException {
        //get file
        Scanner data = new Scanner(new File("src/Ch10ArrayList/Data/randomNumbers.txt"));

        //Store all numbers in file to an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (data.hasNextInt())
            list.add(data.nextInt());

        //Print List
        System.out.println(list);

        //File is no longer needed
        data.close();

        //Print average
        System.out.println(getAverage(list));

        list.sort(Integer::compareTo);

        //Print min
        System.out.println("min: " + list.get(0));

        //Print max
        System.out.println("max: " + list.get(list.size()-1));

        //Print how many numbers were above the average
        System.out.println(getAmountAboveValue(list, getAverage(list))+" number are above average");
        System.out.println(getAmountBelowValue(list, getAverage(list))+" number are below average");

        //Filter out even number
        for (int index = list.size()-1; index >= 0; index--)
            if (list.get(index)%2 == 0)
                list.remove(index);
        System.out.println(list);

    }

    public static double getAverage(ArrayList<Integer> list){
        int sum = 0;
        for (int numb: list) {
            sum+=numb;
        }

        return (double)sum/list.size();
    }

    public static int getAmountBelowValue(ArrayList<Integer> list,double value){
        int counter = 0;
        for (int numb: list)
            if (numb < value)
            counter++;

        return counter;
    }

    public static int getAmountAboveValue(ArrayList<Integer> list,double value){
        int counter = 0;
        for (int numb: list)
            if (numb > value)
                counter++;

        return counter;
    }

}
