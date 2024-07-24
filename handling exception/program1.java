public class program1 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
           
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed");
        }
    }
}