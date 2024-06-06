import java.util.Scanner;
public class startPone{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter for row for print pattern");
        int row = sc.nextInt();
        for(int r=1;r<=row;r++){
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}