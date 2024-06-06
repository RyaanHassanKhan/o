import java.util.Scanner;

public class starPfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        // Upper half of the diamond
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond (excluding the central row)
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = row - 1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
