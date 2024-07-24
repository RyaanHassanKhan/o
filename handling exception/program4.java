
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class program4 {
    public static void main(String[] args) {
        try {
           
            int balance = 1000;
            int withdrawalAmount = 2000;

            if (withdrawalAmount > balance) {
                
                throw new CustomException("Withdrawal amount exceeds available balance");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (CustomException e) {
           
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}
