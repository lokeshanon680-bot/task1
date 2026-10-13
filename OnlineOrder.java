
import java.util.Scanner;

public class OnlineOrder  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount: ₹");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean premium = sc.nextBoolean();

        if (amount >= 1000 || premium) {
            System.out.println("Free Delivery Available");
        } else {
            amount += 50;
            System.out.println("Delivery Charge: ₹50");
        }

        System.out.println("Final Amount: ₹" + amount);

        sc.close();
    }
}
