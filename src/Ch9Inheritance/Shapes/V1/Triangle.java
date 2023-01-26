package Ch9Inheritance.Shapes.V1;

public class Triangle implements Shape {
    private double a,b,c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double s = 0.5 * perimeter();
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public double perimeter(){
        return a+b+c;
    }
}
