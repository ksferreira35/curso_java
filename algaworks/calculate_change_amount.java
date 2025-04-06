import java.text.DecimalFormat;
import java.util.Scanner;

public class calculate_change_amount {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is the price of the product? ");
        Double productPrice = scanner.nextDouble();

        System.out.print("Quantity provided by the customer? ");
        Double priceProvided = scanner.nextDouble();

        Double result = priceProvided - productPrice;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The customer's change is $" + df.format(result));

        scanner.close();
    }

}

