package Ch7Arrays;

import java.util.Arrays;

public class Pratice2DArrays {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        System.out.println("Row Sum:");
        System.out.println(Arrays.toString(rowSum(matrix)));

        System.out.println("Column Sum:");
        System.out.println(Arrays.toString(colSum(matrix)));
    }


    /**
     * gets the sum of each row and returns it
     * @param matrix
     * @return
     */
    public static int[] rowSum(int[][] matrix){
        int[] sum = new int[matrix.length];
        int counter = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int numb : matrix[row])
                sum[counter] += numb;
            counter++;
        }

        return sum;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int[] colSum(int[][] matrix){
        int[] sum = new int[matrix[0].length];
        int counter = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                sum[counter] += matrix[row][col];
            }
            counter++;
        }

        return sum;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int diagSum(int[][] matrix){
        int sum = 0;
        if (matrix.length == matrix[0].length)
            for (int i = 0; i < matrix[0].length; i++)
                sum += matrix[i][i];

        return sum;
    }
}


