
import java.util.Scanner;

public class LoginAttempt  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum attempts: ");
        int maxAttempts = sc.nextInt();

        System.out.print("Enter current failed attempts: ");
        int failedAttempts = sc.nextInt();

        boolean loginFailed = true;

        if (failedAttempts < maxAttempts && loginFailed) {
            failedAttempts++;
            System.out.println("Login Failed");
        }

        if (failedAttempts < maxAttempts) {
            System.out.println("Next attempt is allowed");
        } else {
            System.out.println("Account is locked");
        }

        System.out.println("Failed attempts: " + failedAttempts);

        sc.close();
    }
}
