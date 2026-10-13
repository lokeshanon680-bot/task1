
import java.util.Scanner;

public class SecureTransactionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ₹");
        double balance = sc.nextDouble();

        System.out.print("Enter transfer amount: ₹");
        double amount = sc.nextDouble();

        System.out.print("Enter daily transfer limit: ₹");
        double dailyLimit = sc.nextDouble();

        System.out.print("Is the account active? (true/false): ");
        boolean active = sc.nextBoolean();

        if (amount > 0 && amount <= balance &&
            amount <= dailyLimit && active) {

            balance -= amount;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: ₹" + balance);

        } else {
            System.out.println("Transaction Failed");
            System.out.println("Remaining Balance: ₹" + balance);
        }

        sc.close();
    }
}
