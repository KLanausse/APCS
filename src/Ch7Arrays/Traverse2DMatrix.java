/**
 * This program traverses a matrix in 8 different ways
 *
 * @author : Kai Lanausse
 * @since : Thursday, October 13, 2022
 * @version : 1.0
 */
package Ch7Arrays;

import java.util.Arrays;

public class Traverse2DMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        System.out.println("Zig Zag Right To Left:");
        System.out.println(Arrays.toString(zigZagRTL(matrix)));
        System.out.println();
        System.out.println("Columns Top To Bottom:");
        System.out.println(Arrays.toString(collapseColsTopBottom(matrix)));
        System.out.println();
        System.out.println("Zig Zag Top To Bottom:");
        System.out.println(Arrays.toString(zigZagTTB(matrix)));
    }

    public static int[] zipZagLTR(int[][] matrix){
        int[] collapsed = new int[matrix.length * matrix[0].length];
        int counter = 0;

        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                if (rows % 2 == 0) {
                    collapsed[counter] = matrix[rows][matrix[rows].length - 1 - cols];
                }else {
                    collapsed[counter] = matrix[rows][cols];
                }
                counter++;
            }
        }

        return collapsed ;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int[] zigZagTTB(int[][] matrix){ //COPY OF TTB AND IS UNMODIFIED
        int[] collapsed = new int[matrix.length * matrix[0].length];
        int counter = 0;

        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                collapsed[counter] = matrix[rows][cols];
                counter++;
            }
        }

        return collapsed ;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int[] collapseColsTopBottom(int[][] matrix){
        int[] collapsed = new int[matrix.length * matrix[0].length];
        int counter = 0;

        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++) {
                collapsed[counter] = matrix[rows][cols];
                counter++;
            }
        }

        return collapsed;
    }

    /**
     *
     * @param matrix
     * @return
     */
    public static int[] zigZagRTL(int[][] matrix){
        int[] collapsed = new int[matrix.length * matrix[0].length];
        int counter = 0;

        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                if (rows % 2 == 0) {
                    collapsed[counter] = matrix[rows][matrix[rows].length - 1 - cols];
                }else {
                    collapsed[counter] = matrix[rows][cols];
                }
                counter++;
            }
        }

        return collapsed ;
    }
}
