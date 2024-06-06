import java.util.Scanner;

public class createArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
        System.out.print("enter the elements for the index "+i +":");
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("the elements of array at index" + i+"="+arr[i]+",");
        }
        

        sc.close();
    }
    
    
}
