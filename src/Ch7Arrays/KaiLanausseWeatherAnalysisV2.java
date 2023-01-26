//Version 1: Create a program that gets temperature data for a set number of days and calculate the Average temperature
//Version 2: Brake the program up into methods
package Ch7Arrays;

import java.util.Scanner;

public class KaiLanausseWeatherAnalysisV2 {
    public static void main(String[] args){
        //Get Scanner
        Scanner console = new Scanner(System.in);

        //Ask user days they are going to Calculate
        int days = intro(console);
        int[] daysTemp = dayTemp(console, days);

        //Calculate the Average temperature
        double averageTemp = getAverage(days, daysTemp);

        //Get how many days were above the average temp
        daysAboveAverage(daysTemp, averageTemp);


    }

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

    public static double getAverage(int days, int[] daysTemp) {
        double avr = 0;
        for (int dayTemp: daysTemp
             ) {
            avr += dayTemp;
        }
        avr /= days;
        System.out.println("Average temp = "+Math.round(avr*10)/10.0);
        return avr;
    }

    public static int[] dayTemp(Scanner console, int days) {
        //Create an array to store each day temp
        int[] daysTemp = new int[days];
        for (int i = 0; i < days ; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            daysTemp[i] = console.nextInt();
        }
        return daysTemp;
    }

    public static int intro(Scanner console){
        System.out.print("How many days' temperatures? ");
        return console.nextInt();
    }
}
