import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Primeira Nota: ");
            float n1 = input.nextFloat();

            System.out.print("Segunda Nota: ");
            float n2 = input.nextFloat();

            float m = (n1 + n2) / 2;
            if (m >= 9 ) {
                System.out.println("Parabéns!");
            }

            System.out.printf("A sua média foi %.1f\n", m);
        }
    }
}
