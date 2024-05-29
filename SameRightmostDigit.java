import java.util.Scanner;

public class SameRightmostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;
        
        if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }
}
