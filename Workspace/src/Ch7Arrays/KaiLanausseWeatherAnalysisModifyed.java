/**
 * This program reads some weather data and calculates the average temperature of a week. This program calculates how many days were above average.
 *
 * @author: Kai Lanausse
 * @version: 3
 * @since: September 14th, 2022
 */

//Version 1: Create a program that gets temperature data for a set number of days and calculate the Average temperature
//Version 2: Brake the program up into methods
//Version 3:
package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaiLanausseWeatherAnalysisModifyed {
    public static void main(String[] args){
        //Get Scanner
        Scanner console = new Scanner(System.in);

        //Ask user days they are going to Calculate
        int days = intro(console);
        int[] daysTemp = dayTemp(console, days);

        //Calculate the Average temperature
        double averageTemp = getAverage(daysTemp);

        //Get how many days were above the average temp
        daysAboveAverage(daysTemp, averageTemp);

        System.out.println();

        hottestColdest(daysTemp);

    }

    private static void hottestColdest(int[] daysTemp) {
        System.out.println("Temperatures: " + Arrays.toString(daysTemp));
        Arrays.sort(daysTemp);
        System.out.println("Two coldest days: "+ daysTemp[0] + ", "+ daysTemp[1]);
        System.out.println("Two hottest days: "+ daysTemp[daysTemp.length-1] + ", "+ daysTemp[daysTemp.length-2]);
    }

    /**
     * This method gets how many days were above the average temperature
     * @param daysTemp an int array of each day's temperature
     * @param avr the average temperature
     */
    public static void daysAboveAverage(int[] daysTemp, double avr) {
        int daysAboveAverage = 0;
        for (int dayTemp: daysTemp
        ) {
            if (dayTemp > avr) {
                daysAboveAverage++;
            }
        }

        System.out.println(daysAboveAverage + " days were above average");
    }

    /**
     * This method populates the array and returns the average of the dataset.
     * @param daysTemp an int array of each day's temperature
     * @return
     */
    public static double getAverage(int[] daysTemp) {
        double avr = 0;
        for (int dayTemp: daysTemp
        ) {
            avr += dayTemp;
        }
        avr /= daysTemp.length;
        System.out.println("Average temp = "+Math.round(avr*10)/10.0);
        return avr;
    }

    /**
     * This method populates an array using the user's input
     * @param console used to get user input from the console
     * @param days the number of days
     * @return
     */
    public static int[] dayTemp(Scanner console, int days) {
        //Create an array to store each day temp
        int[] daysTemp = new int[days];
        for (int i = 0; i < days ; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            daysTemp[i] = console.nextInt();
        }
        return daysTemp;
    }

    /**
     * This method ask the user for how many days
     * @param console used to get user input from the console
     * @return return the number of days in the dataset
     */
    public static int intro(Scanner console){
        System.out.print("How many days' temperatures? ");
        return console.nextInt();
    }
}
