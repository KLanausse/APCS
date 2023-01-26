//Version 1: Create a program that gets temperature data for a set number of days and calculate the Average temperature
package Ch7Arrays;

import java.util.Scanner;

public class KaiLanausseWeatherAnalysisV1 {
    public static void main(String[] args){
        //Get Scanner
        Scanner console = new Scanner(System.in);

        //Ask user days they are going to Calculate
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();

        //Create an array to store each day temp
        int[] daysTemp = new int[days];
        for (int i = 0; i < days ; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            daysTemp[i] = console.nextInt();
        }

        //Calculate the Average temperature
        double avr = 0;
        for (int dayTemp: daysTemp
             ) {
            avr += dayTemp;
        }
        avr /= days;
        System.out.println("Average temp = "+Math.round(avr*10)/10.0);

        //Get how many days were above the average temp
        int daysAboveAverage = 0;
        for (int dayTemp: daysTemp
        ) {
            if (dayTemp > avr) {
                daysAboveAverage++;
            }
        }

        System.out.println(daysAboveAverage + " days were above average");
        console.close();

    }
}
