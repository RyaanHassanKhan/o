import java.util.Scanner;
public class fibo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        long i;
        long firstt =0;
        long secondt=1;
        for(i=1;i<=n;i++)
        {
            System.out.println(firstt );
        
            long nextt = firstt+secondt;
        firstt = secondt;
        secondt = nextt;
        }
        sc.close();


    }
}