package Ch9Inheritance.Shapes.V2;

public class Rectangle extends Shape {

    //^Fields
    private double width, height;

    //&Constructors
    public Rectangle(double width, double height){
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    //*Getters
    public double area(){
        return width*height;
    }

    public double perimeter(){
        return (width*2)+(height*2);
    }
}
