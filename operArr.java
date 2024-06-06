import java.util.Scanner;//creatin,add,mul,sub,div of 1D arrays
public class operArr{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size of the array1&2");
        int n = sc.nextInt();
        int u = sc.nextInt();
        int []arr1 = new int[n];
        int []arr2 = new int[u];
        
        int bigArr;
        if(n>u){
        System.out.print("n greater");
         bigArr=n;
        }
        else{
        System.out.println("u greater");
        bigArr=u;
        }
        int [] sum =new int[bigArr];
        int [] mul = new int[bigArr];
        int[] sub = new int[bigArr];
        double [] div= new double[bigArr];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the elements of the array1");
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<u;i++)
        { System.out.print("enter the elemnets of the array 2");
        arr2[i]=sc.nextInt();

        }

        for(int i=0;i<bigArr;i++){
           sum[i] =  arr1[i] + arr2[i];
           
        }
        


        System.out.println("the output sum of the arr1&2 is as follows\n");
        for(int i=0;i<bigArr;i++)
        {
         System.out.print(sum[i]+" ");
        }
        System.out.println();
       
         for(int i=0;i<bigArr;i++){
            mul[i] = arr1[i]*arr2[i];
         }
         System.out.println("the mul of arr1&2");
         for(int i=0;i<bigArr;i++){
            System.out.println(mul[i]+"");
         }
        
         for(int i=0;i<bigArr;i++){

            
            div [i]=(double) arr1[i]/arr2[i];
              
          
         }
         System.out.println("the div of arr1&2");
         for(int i=0;i<bigArr;i++){
            System.out.println(div[i]+"");
         }




        sc.close();



    }
}