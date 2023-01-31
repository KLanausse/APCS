package Ch9Inheritance.Shapes.V2;

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
            System.out.println(shape);

        }

        //^Task5: identify the index where the largest is stored in the container
        int largestIndex = 0;
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[largestIndex].area() < shapes[i].area())
                largestIndex = i;
        }
        System.out.println(shapes[largestIndex]);
    }
}
