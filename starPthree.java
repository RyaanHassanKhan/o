import java.util.Scanner;
public class starPthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int row = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=row+1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}