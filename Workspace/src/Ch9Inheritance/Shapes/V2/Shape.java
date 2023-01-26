package Ch9Inheritance.Shapes.V2;

public abstract class Shape {
    /*
    *1. An abstract is a set of guidelines
    *2. Whoever implements a abstract, it's their respectability to implement all methods listed in the abstract class
    ^3. There is some code sharing in an abstract hierarchy
    !4. You CANNOT instantiate an abstract class
     */

    //^Fields
    private String name;

    //&Constructors
    public Shape(String name){
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();
    public String toString(){
        return
                "Name: " + name + '\n' +
                "Area: " + area() + '\n' +
                "Perimeter: " + perimeter() + '\n'
            ;
    }
}
