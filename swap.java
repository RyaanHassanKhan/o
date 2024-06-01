import java.util.Scanner;
public class swap{
    public static void main(String args[]){
        int a=20,b=30,temp;
        System.out.println("Before swapping \na ="+a +"\nb ="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After awapping with third variable\n a=" +a+"\nb=" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping without a third variabe\n: a=" +a +"\n b =" + b);
        
    }
}