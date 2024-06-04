import java.util.Scanner;

public class SumOddEvenIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Calculate sum of elements at odd indexes
        int sumOdd = 0;
        for (int i = 1; i < size; i += 2) {
            sumOdd += array[i];
        }
        
        // Calculate sum of elements at even indexes
        int sumEven = 0;
        for (int i = 0; i < size; i += 2) {
            sumEven += array[i];
        }
        
        // Output the sums
        System.out.println("Sum of elements at odd indexes: " + sumOdd);
        System.out.println("Sum of elements at even indexes: " + sumEven);
        
        scanner.close();
    }
}

