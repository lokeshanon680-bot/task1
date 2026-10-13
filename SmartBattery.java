
import java.util.Scanner;

public class SmartBattery  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        boolean chargingAllowed = (battery < 90 &&
                                   temperature >= 10 &&
                                   temperature <= 45);

        String status = chargingAllowed
                        ? "Charging Allowed"
                        : "Charging Not Allowed";

        if (chargingAllowed) {
            battery += 5;
            if (battery > 100) {
                battery = 100;
            }
        }

        System.out.println("Charging Status: " + status);
        System.out.println("Battery Level: " + battery + "%");

        sc.close();
    }
}
