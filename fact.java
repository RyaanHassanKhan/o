import java.util.Scanner;

public class fact{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        long a = sc.nextLong();
        int facto=1,i;
        for(i=1;i<=a;i++)
        {
            facto = facto*i;
        }
        System.out.println("Facto of " +a+"is"+facto);

        sc.close();
    }
}