package constructors;

import java.util.Scanner;

public class conone {
    int r, b, l;

    public conone(int r, int b, int l) {
        this.r = r;
        this.b = b;
        this.l = l;
    }

    public void display() {
        System.out.println("Radius: " + r);
        System.out.println("Breadth: " + b);
        System.out.println("Length: " + l);
    }

    public int area() {
        int areaRect = l * b;
        System.out.println("The area of the rectangle: " + areaRect);
        int areaCircle = (int) (3.14 * r * r); // Cast to int for consistency
        System.out.println("The area of the circle: " + areaCircle);
        return areaRect + areaCircle;
    }

    public int circumference() {
        int circRect = 2 * (l + b);
        System.out.println("The circumference of the rectangle: " + circRect);
        int circCircle = (int) (2 * 3.14 * r); // Cast to int for consistency
        System.out.println("The circumference of the circle: " + circCircle);
        return circRect + circCircle;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius, breadth, and length: ");
        int r = sc.nextInt();
        int b = sc.nextInt();
        int l = sc.nextInt();
        sc.close();

        conone obj = new conone(r, b, l);
        obj.display();
        obj.area();
        obj.circumference();
    }
}
