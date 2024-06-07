import java.util.Scanner;
public class raised {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a numver");
        int num = sc.nextInt();
        System.out.print("enter the the power for the number");
        int pow = sc.nextInt();
        int re = 1;;
        for(int i=1;i<=pow;i++){
         re = re *num;
        }
        System.out.print(num + "raised to the pow"+pow+"="+re);

        sc.close();
    }
    
}
