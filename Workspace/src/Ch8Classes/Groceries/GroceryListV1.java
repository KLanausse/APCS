package Ch8Classes.Groceries;

import java.util.Arrays;

/**
 * This program keeps track of the grocery list
 *
 *  @author: Kai Lanausse
 *  @since: November 18, 2022
 *  @version: 1.0
 */

public class GroceryListV1 {
    private static final int MAX_ITEMS = 10;

    //fields
    private GroceryItemOrderV1[] list;
    private int numItems;

    //con

    public GroceryListV1() {
        list = new GroceryItemOrderV1[MAX_ITEMS];
        numItems = 0;
    }

    //get
    public double getTotalCost(){
        double sum = 0.0;
        for (int i = 0; i < numItems; i++) {
            sum+=list[i].getCost();
        }
        return sum;
    }

    //set
    public void addItem(GroceryItemOrderV1 item){
        list[numItems] = item;
        numItems++;
    }

    //toString

    @Override
    public String toString() {
        String output = "Your Grocery List:\n\n";
        for (int i = 0; i < numItems; i++) {
            output+=list[i]+"\n";
        }
        return output + "\n\n"+"Total Cost: $" + getTotalCost();
    }
}
