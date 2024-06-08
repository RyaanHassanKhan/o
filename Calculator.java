import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print("Enter the operation to be performed (+ for addition, - for subtraction): ");
        char op = sc.next().charAt(0);  // Read a character input
        
        int result = 0;  // Initialize result variable

        if (op == '+') {
            result = a + b;
            System.out.println("The sum is: " + result);
        } else if (op == '-') {
            result = a - b;
            System.out.println("The subtracted value is: " + result);
        } else {
            System.out.println("Invalid operation.");
        }

        sc.close();  // Close the Scanner object
    }
}
