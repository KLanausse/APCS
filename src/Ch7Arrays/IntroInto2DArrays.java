package Ch7Arrays;

public class IntroInto2DArrays {
    public static void main(String[] args){
        String[][] gridToPrint = populateStars();
        printStars(gridToPrint);
    }

    public static void printStars(String[][] grid){
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 5 ; cols++) {
                System.out.print(grid[rows][cols]);
            }
            System.out.println();
        }
    }

    public static String[][] populateStars(){
        String[][] starGrid = new String[4][5];
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 5 ; cols++) {
                starGrid[rows][cols] = "*";
            }
        }
        return starGrid;
    }
}
