import java.util.Scanner;

public class eo{
    public static void main(String args[])
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        //take inout
        System.out.println("enter the number a =");
        //scann the input
        long a = sc.nextLong();
        //check the number is even or odd
        if(a%2==0)
        {
            System.out.println("the number is even");

        }
        else{
            System.out.println("the number id odd");
        }
    
        sc.close();
    }
}