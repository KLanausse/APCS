/**
 * This program is a blueprint for creating point objects on a cartesian coordinate.
 * Version 2: This version will add constructors
 * Version 3: add overloaded constructors,a toString to print the object
 * Version 4: encapsulates the fields so they are restricted
 * Version 5: This version includes the ability to compare two point objects
 *
 * @author: Kai Lanausse
 * @since: January 24, 2023
 * @version: 5.0
 */
package Ch8Classes.Point;

public class PointV5 {
    //State (To store the data of an object)
        //synonyms - fields, instance variables, state fields
        //private visibility forces encapsulation
    private int x;
    private int y;
    public String name;

    //Constructor(s) - used to init all fields
        //A constructor gets called implicitly when an object is instantiated used the keyword new
        //A constructor does NOT have a return type
    public PointV5(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public PointV5(int x, int y){
        this("Point", x, y);
    }

    public boolean equals(Object other){
        return other instanceof PointV5 && this.x == ((PointV5)other).x && this.y == ((PointV5)other).y;
    }

    public PointV5(String name){
        this(name, 0, 0);
    }

    //Default constructor
        //the default constructor is deleted when you create your own constructor with params
    public PointV5(){
        this("Origin",0,0);
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
    public double distance(PointV5 other){
        return Math.sqrt(Math.pow(x - other.x, 2)+Math.pow(y - other.y, 2));
    }

    public int getX(){ return x;}
    public int getY(){ return y;}

    /**
     * the toString method is called
     * @return
     */
    @Override
    public String toString(){
        if ( name.toLowerCase().charAt(name.length() - 1) == 's' ){
            return name+"' location is: (" + x + ", " + y + ")";
        }
        return name+"'s location is: (" + x + ", " + y + ")";
    }
}
