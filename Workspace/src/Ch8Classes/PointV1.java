/**
 * This program is a blueprint for creating point objects on a cartesian coordinate
 *
 * @author: Kai Lanausse
 * @since: October 26, 2022
 * @version: 1.0
 */
package Ch8Classes;

public class PointV1 {
    //State (To store the data of an object)
        //synonyms - fields, instance variables, state fields
    public int x;
    public int y;

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
    public double distance(PointV1 other){
        int dx = x - other.x;
        int dy = y - other.y;
        double dxSquare = Math.pow(dx, 2);
        double dySquare = Math.pow(dy, 2);
        double distance = Math.sqrt(dxSquare+dySquare);
        return distance;
    }
}
