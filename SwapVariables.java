import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        // Swapping with third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (with third variable): a = " + a + ", b = " + b);
        
        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without third variable): a = " + a + ", b = " + b);
        
        sc.close();
    }
}
