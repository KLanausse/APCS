package Ch8Classes.Groceries;
/**
 * This class populates and prints thanksgiving grocery list for period 7.
 *
 *  @author: Kai Lanausse
 *  @since: November 18, 2022
 *  @version: 1.0
 */

public class GroceriesClientV1 {
    public static void main(String[] args){
        GroceryListV1 thanksgivingList = new GroceryListV1(); //instantiates a grocery list

        thanksgivingList.addItem(new GroceryItemOrderV1("Cranberry Sauce", 3, 10));
        thanksgivingList.addItem(new GroceryItemOrderV1("Stuffing", 2, 78));
        thanksgivingList.addItem(new GroceryItemOrderV1("Turkey", 2, 0.75));

        System.out.println(thanksgivingList);
    }
}
