public class program3 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts");

            try {
                System.out.println("Inner try block starts");

                
                int result = 10 / 0;

                System.out.println("Inner try block ends");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught inside inner try block: " + e.getMessage());
            }

           
            System.out.println("Outer try block ends");
        } catch (Exception e) {
            System.out.println("Exception caught in outer try block: " + e.getMessage());
        }

        System.out.println("Program continues to execute...");
    }
}
