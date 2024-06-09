import java.util.Scanner;

public class carti {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print ("enter the coordinates for the plan");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out .print ("the coordinates are of the origin");

        }
        else if(x>0&&y>0){
            System.out.print("the coordinates are in the first quadrant");
        }
        else if (x<0&&y>0)
        {
            System.out.print("the coordintes are int the second codirant");
        }
        else if (x<0&&y<0)
        {
            System.out.print("the coorsinate are of the third quadrnt");
        }
        else if (x>0&& y<0){
            System.out.print("the coordinates are of the fourth quadrannt");
        }
        sc.close();

    }
    
}
