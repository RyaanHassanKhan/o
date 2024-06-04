import java.util.Scanner;
public class ptables{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number:");
                int num = scanner.nextInt();
                printTable(num);     
        
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}