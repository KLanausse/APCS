package Ch7Arrays;

import java.util.Scanner;

public class KaiLanausseMultiplicationTableMod {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Give a range for the multiplication table.");
        System.out.print("x: ");
        int x = console.nextInt();
        System.out.print("y: ");
        int y = console.nextInt();
        System.out.print("Size: ");
        int size = console.nextInt();
        printMatrix( createMultiplicationTable(x,y,size) );

    }

    /**
     * Creates a multiplication table based off the given width and height
     * @param x Table Staring Number
     * @param y Table Ending Number
     * @param size the size of the table
     * @return
     */
    private static int[][] createMultiplicationTable(int x, int y, int size) {
        int[][] matrix = new int[Math.abs(y-x)+1][size];

        //Populate and return it
        for (int row = 1; row <= matrix.length; row++)
            for (int col = 1; col <= matrix[0].length ; col++)
                matrix[row-1][col-1] = (row+x-1)*col;

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
