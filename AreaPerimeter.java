import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
        
        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);
        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("Rectangle Perimeter: " + rectPerimeter);
        
        sc.close();
    }
}
