package Ch9Inheritance.Shapes.V1;

public class ShapesClient {
    public static void main(String[] args) {
        //^Task1: create an array of Shape of size 3
        //^Task2: create 3 shapes - Circle, Rectangle, Triangle
        //^Task3: put the 3 shapes from Task2 in the array
        Shape[] shapes = {
            new Circle(1),
            new Rectangle(2, 3),
            new Triangle(3, 3, 3)
        };

        //^Task4: print the area and perimeter of each object in the context of a loop
        for (Shape shape : shapes) {
            System.out.println(
                "Area: " + shape.area() + '\n' +
                "Perimeter: " + shape.perimeter()
            );

        }
    }
}
