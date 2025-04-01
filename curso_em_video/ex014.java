// Programa que utiliza uma entrada de dados para numerador e denominador, mostrando a divisão e o resto da divisão.
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Usei o try so pra o input não ficar sublinhado.

            System.out.print("Digite o numerador: ");
            int num = input.nextInt();

            System.out.print("Digite o denomidaor: ");
            int den = input.nextInt();

            float divi = (float) num / den;
            int resto = num % den;

            System.out.printf("A divisão entre %d e %d é igual a %.2f .\n", num, den, divi);
            System.out.printf("O resto da divisão entre %d e %d é igual a %d .\n", num, den, resto);
        }    
    }
}
// Desenvolvido por Kaiky - 2025
