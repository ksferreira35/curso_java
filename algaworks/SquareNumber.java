import java.util.Scanner;

public class SquareNumber {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to square: ");
        long num = scanner.nextLong();

        double pow = Math.pow(num, 2);

        System.out.printf("The number %d squared is %.0f.\n", num, pow);

        scanner.close();
    }
}
