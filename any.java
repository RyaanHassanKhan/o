import java.util.Scanner;
public class any{
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        for(int i=1;i<5;i++){
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }

        for(int k=5-1;k>=i;k--){
            System.out.print("* ");
        }
        System.out.println();
        }

        sc.close();

    }
}