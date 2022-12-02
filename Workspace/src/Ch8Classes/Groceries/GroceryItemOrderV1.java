package Ch8Classes.Groceries;
/**
 * This class stores info about a single grocery item being ordered
 *
 *  @author: Kai Lanausse
 *  @since: November 18, 2022
 *  @version: 1.0
 */

public class GroceryItemOrderV1 {
    //fields
    private String name;
    private int quantity;
    private double ppu;

    //constructors

    public GroceryItemOrderV1(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }


    //getters
    public double getCost(){
        return ppu*quantity;
    }

    //setters

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //toString

    @Override
    public String toString() {
        return quantity + "\t\t" + name + "\t\t$" + ppu;
    }
}
