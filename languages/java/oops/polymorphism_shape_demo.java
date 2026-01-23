import java.util.Scanner;

interface Shape {
    	double area();
    	double perimeter();
}

class Circle implements Shape {
    	private double radius;

    	public Circle(double radius) {
        	this.radius = radius;
    	}

    	public double area() {
        	return (3.14 * radius * radius);
    	}

    	public double perimeter() {
        	return (2 * 3.14 * radius);
    	}
}

class Rectangle implements Shape {
    	private double length;
    	private double breadth;

    	public Rectangle(double length, double breadth) {
        	this.length = length;
        	this.breadth = breadth;
    	}

    	public double area() {
        	return (length * breadth);
    	}

    	public double perimeter() {
        	return (2 * (length + breadth));
    	}
}

public class ShapeDemo {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Choose a Shape: 1. Circle  2. Rectangle");
        	int choice = sc.nextInt();

        	Shape ref; 

        	if (choice == 1) {
            		System.out.print("Enter radius of circle: ");
            		double r = sc.nextDouble();
            		ref = new Circle(r);
        	} else if (choice == 2) {
            		System.out.print("Enter length of rectangle: ");
            		double l = sc.nextDouble();
            		System.out.print("Enter breadth of rectangle: ");
            		double b = sc.nextDouble();
            		ref = new Rectangle(l, b);
        	} else {
            		System.out.println("Invalid Choice!");
            		sc.close();
            		return;
        	}

        	System.out.println("Area: " + ref.area());
        	System.out.println("Perimeter: " + ref.perimeter());

        sc.close();
    }
}
