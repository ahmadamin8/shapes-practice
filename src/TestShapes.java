import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the width of the rectangle?");
        double width = userInput.nextDouble();

        System.out.println("What is the height of the rectangle?");
        double height = userInput.nextDouble();

        System.out.println("What is the side of the square?");
        double side = userInput.nextDouble();

        System.out.println("What is the radius of the circle?");
        double radius = userInput.nextDouble();

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(width, height);
        Square square = new Square(side);

        ArrayList<Shape> allShapes = new ArrayList<>();
        allShapes.add(circle);
        allShapes.add(rectangle);
        allShapes.add(square);

        double biggestArea = Double.MIN_VALUE;
        Shape largestAreaShape = null;

        for (Shape element : allShapes) {
            System.out.println("\n" + element);
            System.out.println("Area of the " + element.getClass().getSimpleName() + " is = " + element.area());
            System.out.println("Perimeter of the " + element.getClass().getSimpleName() + " is = " + element.perimeter());
            if(element.area() > biggestArea){
                biggestArea = element.area();
                largestAreaShape = element;
            }
        }

        System.out.println("\n" + largestAreaShape.getClass().getSimpleName() + " has the largest area as " + biggestArea);



    }
}
