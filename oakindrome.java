import java.util.Scanner;
public class oakindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a striing");
        String str = sc.nextLine();
        boolean Ispal= true;
        int len =str.length();


       for(int i = 0; i<=len/2;i++)
       {
          if(str.charAt(i)!= str.charAt(len-1-i))
           {
            Ispal = false;
            break;
           } 

       }
        if(Ispal ){
            System.out.print("the given dtring is a palindrome");
        }
        else{
            System.out.print("the given string is not a palindrome");
        }
        

        sc.close();
       
    }

    
}
