package Ch7Arrays;

public class KaiLanausseTraverseCols2DMats {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        //Top To Bottom
        printMatrixTTB(matrix);
        System.out.println();

        //Bottom To Top
        printMatrixBTT(matrix);
        System.out.println();

        //Zig Zag Top To Bottom
        printMatrixZigZagTTB(matrix);
        System.out.println();

        //Zig Zag Bottom To Top
        printMatrixZigZagBTT(matrix);

    }

    public static void printMatrixTTB(int[][] matrix){
        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++)
                System.out.print(matrix[rows][cols] + "\t");
            System.out.println();
        }
    }

    public static void printMatrixBTT(int[][] matrix){
        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++)
                System.out.print(matrix[rows][matrix.length-1-cols] + "\t");
            System.out.println();
        }
    }

    public static void printMatrixZigZagTTB(int[][] matrix) {
        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++)
                 if(rows%2==1){
                     System.out.print(matrix[rows][matrix[0].length-1-cols] + "\t");
                 }else {
                     System.out.print(matrix[rows][cols] + "\t");
                 }
            System.out.println();
        }
    }

    public static void printMatrixZigZagBTT(int[][] matrix) {
        for (int cols = 0; cols < matrix[0].length; cols++) {
            for (int rows = 0; rows < matrix.length; rows++)
                if(rows%2==0){
                    System.out.print(matrix[rows][matrix[0].length-1-cols] + "\t");
                }else {
                    System.out.print(matrix[rows][cols] + "\t");
                }
            System.out.println();
        }
    }
}
