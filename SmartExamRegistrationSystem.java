
import java.util.Scanner;

public class SmartExamRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Is medical certificate approved? (true/false): ");
        boolean medical = sc.nextBoolean();

        System.out.print("Is examination fee paid? (true/false): ");
        boolean feePaid = sc.nextBoolean();

        System.out.print("Are all assignments submitted? (true/false): ");
        boolean assignments = sc.nextBoolean();

        boolean eligible = (attendance >= 75 ||
                           (attendance >= 65 && medical))
                           && feePaid && assignments;

        String result = eligible
                        ? "Registration Successful"
                        : "Registration Rejected";

        System.out.println(result);

        sc.close();
    }
}
