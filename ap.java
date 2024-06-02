import java.util.Scanner;
public class ap{
    public static void main(String args[])
    {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length and breath for the rectangle");
    int l = sc.nextInt();
    int b = sc.nextInt();
    int perimeter = l*b;
    System.out.println("the perimeter of the rectangle is"+ perimeter);
    int area =l*b;
    System.out.println("the area of the rectangle is"+area);
    System.out.println("enter the radius of the circle");
    double r = sc.nextInt();
    double area1 = 3.14*r*r;
    System.out.println("the area of the circle is "+area);
    double perimeterq = 2*3.14*r;
    System.out.println("the perimeer of the circle is " +perimeterq);
    sc.close();


   }
}
    

