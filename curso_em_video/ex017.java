// Programa que utiliza entrada de dados para numerador, denominador e um número, em seguida calcula a divisão, resto da divisão e a raiz quadrada do número desejado.
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite o numerador: ");
            int a = input.nextInt();
            System.out.print("Digite o denominador: ");
            int b = input.nextInt();

            System.out.print("Digite um número para descobrir sua raiz quadrada: ");
            int c = input.nextInt();
            float rq = (float) Math.sqrt(c);
            
            float divi = (float) a / b;
            int resto = a % b;

            System.out.printf("A divisão entre %d e %d é igual a %.2f\n", a, b, divi);
            System.out.printf("O resto da divisão entre %d e %d é igual a %d\n", a, b, resto);
            System.out.printf("A raiz quadrada de %d é igual ou aproximadamente a %.1f\n", c, rq);
        }
    }
}
// Desenvolvido por Kaiky - 2025
