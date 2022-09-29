/**
 * This program finds the most frequent digit in a given number. If there is a tie, then the program returns the lower number.
 * This version applies procedural decomposition.
 * @author: Kai Lanausse
 * @since: September 23, 2022
 * @version: 2.0
 */

package Ch7Arrays;

import java.util.Arrays;

public class ArrayTallyV2 {

    public static void main(String[] args) {
        int[] tally = new int[10]; //creates an int array of size 10

        tallyDigits(tally, 57135203);
        System.out.println(getMode(tally));
    }

    /**
     * This tallies all the digits in num
     * @param tally contains the frequency analysis of num
     * @param num is the number to tally
     */
    public static void tallyDigits(int[] tally, int num){
        while (num > 0) {
            int digit = num % 10;
            tally[digit]++;
            //tally[num%10]++;

            num /= 10; //num = num / 10
        }
    }

    /**
     * This method returns the mode such that if there is a tie, it returns the smaller value
     * @param digitFreq
     * @return
     */
    public static int getMode(int[] digitFreq){
        int modeIndex = digitFreq.length-1;

        for (int i = digitFreq.length - 2; i >= 0; i--) {
            if (digitFreq[i] >= digitFreq[modeIndex]) {
                modeIndex = i;
            }
        }
        return modeIndex;
    }
}