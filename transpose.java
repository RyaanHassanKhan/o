public class transpose {
    public static void main (String[] args) 
    {
        int[][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] arr1 = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[j][i]=arr[i][j];
            }
            
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
               
                System.out.print(arr1[i][j]+" ");
            }
            
            System.out.println();
        }

    }

    
}
