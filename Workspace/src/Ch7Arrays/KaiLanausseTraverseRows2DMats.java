package Ch7Arrays;

public class KaiLanausseTraverseRows2DMats {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        //Left To Right
        printMatrixLTR(matrix);
        System.out.println();

        //Right To Left
        printMatrixRTL(matrix);
        System.out.println();

        //Zig Zag
        printMatrixZigZag(matrix);
        System.out.println();

        //Zag Zig
        printMatrixZagZig(matrix);

    }

    public static void printMatrixLTR(int[][] matrix){
        for (int[] row : matrix) {
            for (int col : row)
                System.out.print(col + "\t");
            System.out.println();
        }
    }

    public static void printMatrixRTL(int[][] matrix){
        for (int[] row : matrix) {
            for (int cols = 0; cols < row.length; cols++)
                System.out.print(row[row.length-1-cols] + "\t");
            System.out.println();
        }
    }

    public static void printMatrixZigZag(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                if (rows%2==1) {
                    System.out.print(matrix[rows][matrix[0].length - 1 - cols] + "\t");
                }else {
                    System.out.print(matrix[rows][cols]  + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void printMatrixZagZig(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                if (rows%2==0) {
                    System.out.print(matrix[rows][matrix[0].length - 1 - cols] + "\t");
                }else {
                    System.out.print(matrix[rows][cols]  + "\t");
                }
            }
            System.out.println();
        }
    }

}
