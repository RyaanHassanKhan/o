import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        
        if (x == 0 && y == 0) {
            System.out.println("Point is at the origin.");
        } else if (x == 0) {
            System.out.println("Point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("Point lies on the X-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("Point lies in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in the fourth quadrant.");
        }
        
        sc.close();
    }
}
