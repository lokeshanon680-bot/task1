
import java.util.Scanner;

public class Evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num > 10) {
            System.out.println("The number is even and greater than 10.");
        } else {
            System.out.println("The number does not satisfy both conditions.");
        }

        sc.close();
    }
}
