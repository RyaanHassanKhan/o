import java.util.Scanner;

public class lp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter thee year yyyy : ");
        int year = sc.nextInt();
        boolean isLeap= false;
        if((year%4==0 && year %100!=0) || (year%400==0)){
            isLeap=true;
        }
        if(isLeap){
            System.out.print("leapyear");
        }
        else{
            System.out.print("notleapyear");
        }
        sc.close();


    }
}
