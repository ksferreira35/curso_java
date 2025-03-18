import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite o valor de A: ");
            int a = input.nextInt();

            System.out.print("Digite o valor de B: ");
            int b = input.nextInt();

            System.out.print("Digite o valor de C: ");
            int c = input.nextInt();

            int delta = (b * b) - (4 * a * c);

            System.out.printf(" Δ = %d² - 4 * %d * %d\n", b, a, c);
            System.out.printf(" Δ = %d - %d\n", (b * b), (4 * a * c));
            System.out.printf(" Δ = %d\n", delta);

            input.close();
        }
    }
}
