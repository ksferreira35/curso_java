package cap4;
import java.util.Scanner;

public class DiscountAndShipping {
    static double SHIPPINGFEE = 15;
    static double LIMIT = 100.0;
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase value: ");
        double totalValue = scanner.nextDouble();

        boolean freeShipping = totalValue >= LIMIT;

        if (freeShipping) {
            System.out.printf("You get free shipping! Final amount: $%.2f\n", totalValue);
        } else {
            totalValue += SHIPPINGFEE;
            System.out.printf("Shipping fee of $%.2f applied. Final amount: $%.2f\n", SHIPPINGFEE, totalValue);
        }

        scanner.close();
    }
}
