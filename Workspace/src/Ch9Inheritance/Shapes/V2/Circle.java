package Ch9Inheritance.Shapes.V2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
