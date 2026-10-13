
import java.util.Scanner;

public class StudentPassChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's mark: ");
        int mark = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        String result = (mark >= 40 && attendance >= 75)
                        ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        sc.close();
    }
}
