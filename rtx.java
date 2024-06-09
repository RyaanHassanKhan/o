import java.util.Scanner;
public class rtx
{
    public static void main(String[] args)
    { 
         Scanner sc = new Scanner (System.in);
        System.out.print("enter three integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lasta = a %10;
        int lastb = b%10;
        int lastc = c%10;
        if (lasta == lastb)
        {
            System.out.print("the last digit of a & b are the same");
        }
        else if  (lasta == lastc)
        {
            System.out.print("the lst digit of a and c are the same");
        }
        else if (lastb == lastc)
        {
           System.out.print("the last didgit of c and and b are the smae"); 
        }
        else {
            System.out.print("no two matching riight most digit");
        }
        sc.close();

    }
}