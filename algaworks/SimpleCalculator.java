import java.util.Scanner;

public class SimpleCalculator {

    static final int ONE = 1;
    static final int FOUR = 4;
    static final String CANNOT_DIVIDE_BY_ZERO = "Cannot divide by zero.";

    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = showMenu(scanner);

        System.out.print("First number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Second number: ");
        double num2 = scanner.nextDouble();

        Double result = calculateResult(choice, num1, num2);

        if (result != null) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    public static int showMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.print("Your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice < ONE || choice > FOUR) {
                System.out.println("Invalid option. Please choose a number between 1 and 4.\n");
            }
        } while (choice < ONE || choice > FOUR);

        return choice;
    }

    public static Double calculateResult(int choice, double num1, double num2) {
        return switch (choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println(CANNOT_DIVIDE_BY_ZERO);
                    yield null;
                } else {
                    yield num1 / num2;
                }
            }
            default -> null;
        };
    }
}
