public class program5 {
    public static void main(String[] args) {
        try {
            int result = divideByZero(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static int divideByZero(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return numerator / denominator;
    }
}
