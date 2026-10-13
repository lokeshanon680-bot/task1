
import java.util.Scanner;

public class PasswordLength  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Is the account active? (true/false): ");
        boolean isActive = sc.nextBoolean();

        String result = (password.length() >= 8 && isActive)
                        ? "Valid" : "Invalid";

        System.out.println("Password Status: " + result);

        sc.close();
    }
}
