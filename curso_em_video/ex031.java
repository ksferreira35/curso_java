// Programa que analisa um número e mostra ser ímpar ou par.
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um número para descobrir se é ímpar ou par: ");
            long num = input.nextLong();

            if (num % 2 == 0) {
                System.out.println("O número é par!");
                
            } else {
                System.out.println("O número é ímpar!");
            }
        }
    }
}
// Desenvolvido por Kaiky - 2025
