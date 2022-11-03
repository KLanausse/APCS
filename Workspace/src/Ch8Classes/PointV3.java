/**
 * This program is a blueprint for creating point objects on a cartesian coordinate.
 * Version 2: This version will add constructors
 * Version 3: add overloaded constructors,a toString to print the object
 *
 * @author: Kai Lanausse
 * @since: October 26, 2022
 * @version: 2.0
 */
package Ch8Classes;

public class PointV3 {
    //State (To store the data of an object)
        //synonyms - fields, instance variables, state fields
    public int x;
    public int y;

    //Constructor(s) - used to init all fields
        //A constructor gets called implicitly when an object is instantiated used the keyword new
        //A constructor does NOT have a return type
    public PointV3(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Default constructor
        //the default constructor is deleted when you create your own constructor with params
    public PointV3(){
        this.x = 0;
        this.y = 0;
    }

    //Behaviors (methods that you can call to update the state)
        //Setters (are void methods. ex. Deposit money)

    /**
     * Sets the X,Y portion of the point
     * @param newX the new X position
     * @param newY the new Y position
     */
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;
    }

    /**
     *  Moves/Translates the point
     * @param dx distance on the X-axis
     * @param dy distance on the Y-axis
     */
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }
        //Getters (non-void methods that return some value)

    /**
     * gets the distance between 2 points
     * @param other A Point
     * @return
     */
    public double distance(PointV3 other){
        return Math.sqrt(Math.pow(x - other.x, 2)+Math.pow(y - other.y, 2));
    }

    /**
     * the toString method is called
     * @return
     */
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
