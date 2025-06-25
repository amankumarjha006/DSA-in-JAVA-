package OOPS;
import java.util.Scanner;

abstract class Shape{
    abstract double getArea();
    abstract double getPerimeter();
}

// If the shape is rectangle
class Rectangle extends Shape{// extends is used to inherit the poperties of abstract class shape
    int length;
    int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return length * breadth;
    }
    double getPerimeter(){
        return 2 * (length + breadth);
    }
}

// If the shape is Square
class Square extends Shape{
    int side;
    public Square(int side) {
        this.side = side;
    }
    double getArea(){
        return side * side;
    }

    double getPerimeter(){
        return 4 * side;
    }
}

// If the shape is Circle
class Circle extends Shape{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    double getArea(){
        return 3.14 * radius * radius;
        }
    double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}

public class Oops_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Enter the choice of shape(square/rectangle/circle)---- ");
        String shapeType = sc.nextLine();

        Shape shape = null; // here we are creating an object of Shape class

        if(shapeType.equalsIgnoreCase("square")){
            System.out.println("\nEnter the side of square: ");
            int side = sc.nextInt();
            sc.nextLine();
            sc.close();
            shape = new Square(side);// here polymorphism is being used 
            System.out.println("\n===Area of square===\n "+shape.getArea());
            System.out.println("\n===Perimeter of square===\n "+shape.getPerimeter());
        }
        else if(shapeType.equalsIgnoreCase("Rectangle")){
            System.out.println("\nEnter the length of rectangle: ");
            int length = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEnter the breadth of rectangle: ");
            int breadth = sc.nextInt();
            sc.nextLine();
            sc.close();
            shape = new Rectangle(length,breadth);// here polymorphism is being used
            System.out.println("\n===Area of rectangle===\n "+shape.getArea());
            System.out.println("\n===Perimeter of rectangle===\n "+shape.getPerimeter());
            }
        else if(shapeType.equalsIgnoreCase("circle")){
            System.out.println("\nEnter the radius of circle: ");
            int radius = sc.nextInt();
            sc.nextLine();
            sc.close();
            shape = new Circle(radius);// here polymorphism is being used
            System.out.println("\n===Area of circle===\n "+shape.getArea());
            System.out.println("\n===Circumference of circle===\n "+shape.getPerimeter());
            }
    }


        
}
    

