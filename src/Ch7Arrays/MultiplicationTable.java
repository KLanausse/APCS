package Ch7Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Give a size for the multiplication table.");
        System.out.print("Width: ");
        int width = console.nextInt();
        System.out.print("Height: ");
        int height = console.nextInt();
        printMatrix( createMultiplicationTable(width,height) );

        console.close();

    }

    /**
     * Creates a multiplication table based off the given width and height
     * @param width Table Width
     * @param height Table Height
     * @return
     */
    private static int[][] createMultiplicationTable(int width, int height) {
        int[][] matrix = new int[height][width];
        //Populate and return it
        for (int i = 1; i <= height; i++)
            for (int j = 1; j <= width ; j++)
                matrix[i-1][j-1] = (i*j);

        return matrix;
    }

    /**
     * Prints the matrix in a grid to console
     * @param matrix Provided matrix
     */
    private static void printMatrix(int[][] matrix) {

        //Print the table
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "\t");

            System.out.println();
        }

    }
}
