// Programa que permite o usuário digitar seu ano de nascimento e a partir disso descobre a sua idade.
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Usei o try so pra o input não ficar sublinhado.
            System.out.print("Que ano você nasceu? ");
            int ano = input.nextInt();
            int idade = 2025 - ano;
            System.out.printf("Você tem ou vai fazer %d anos.\n", idade);
        }    
    }
}
// Desenvolvido por Kaiky - 2025
