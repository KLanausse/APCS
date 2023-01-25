package Ch9Inheritance.Shapes;

public interface Shape {
    /*
    *1. An Interface is a set of guidelines
    *2. Whoever implements a interface, it's their respectability to implement all methods listed in the interface
    ^3. There is 0% code sharing
    !4. You CANNOT instantiate an interface
     */

    public double area();
    public double perimeter();
}
