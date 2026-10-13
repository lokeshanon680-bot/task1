
import java.util.Scanner;

public class InventoryReorder  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current stock: ");
        int currentStock = sc.nextInt();

        System.out.print("Enter minimum stock level: ");
        int minStock = sc.nextInt();

        System.out.print("Enter incoming stock: ");
        int incomingStock = sc.nextInt();

        currentStock += incomingStock;

        String result = (currentStock < minStock)
                        ? "Reorder Required"
                        : "Stock Sufficient";

        System.out.println("Updated Stock: " + currentStock);
        System.out.println(result);

        sc.close();
    }
}
