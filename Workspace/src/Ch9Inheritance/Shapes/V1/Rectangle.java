package Ch9Inheritance.Shapes.V1;

public class Rectangle implements Shape {

    //^Fields
    private double width, height;

    //&Constructors
    public Rectangle(double width, double height){
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
