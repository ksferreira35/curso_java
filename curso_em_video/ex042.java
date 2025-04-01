// Programa que calcula o fatorial do número fornecido pelo o usuário
import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número pra ver seu fatorial (999 para sair) ");
            long num = input.nextLong();

            if (num == 999) {
                input.close();
                break;
            }

            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("-=".repeat(20));
            System.out.printf("O valor do fatorial é %d\n", fatorial);
            System.out.println("-=".repeat(20));
        }
    }
}
// Desenvolvido por Kaiky - 2025
