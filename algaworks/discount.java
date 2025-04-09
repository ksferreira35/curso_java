import java.util.Scanner;

public class discount {

    static final Integer MIN_QUANTITY_FOR_DISCOUNT = 10;
    static final Float DISCOUNT = 0.9f;  // equivalent to 10% discount
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double priceProduct;
            double totalPrice;
            double withDiscount;
            long quantity;

            System.out.print("How much is the product? ");
            priceProduct = scanner.nextDouble();

            System.out.print("How many products do you want to buy? ");
            quantity = scanner.nextLong();

            totalPrice = priceProduct * quantity;

            
            if (quantity >= MIN_QUANTITY_FOR_DISCOUNT) {
                withDiscount = totalPrice * DISCOUNT;
                System.out.printf("The price is $%.2f with 10%% discount\n", withDiscount);
            } else {
                System.out.printf("The price is $%.2f\n", totalPrice);
            }
        }
    }
}
