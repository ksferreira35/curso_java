package cap4;
import java.util.Scanner;

public class HouseHoldExpense {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] expenses = {
            "Electricity: ",
            "Water: ",
            "Phone: ",
            "School: ",
            "Credit Card: ",
            "Supermarket: "
        };

        double total = calculateExpenses(expenses, scanner);

        System.out.printf("Total household expenses: $%.2f\n", total);

        scanner.close();
    }


    public static double calculateExpenses(String[] messages, Scanner scanner) {
        double total = 0.0;

        for (String msg : messages) {
            System.out.print(msg);
            total += scanner.nextDouble();
        }

        return total;
    }
}
