import java.util.Scanner;
public class l3{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
     if(a>b && a>c)
{
    System.out.println("a is the largest number");
    
}
     else if(b>c) {
    System.out.println("b is the largest number");
}
    else

{
    System.out.println("c is the largest no.");

}


       sc.close();
    }
}
