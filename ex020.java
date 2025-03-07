// Programa que utiliza uma entrada de dados para calcular, resto de divisão, elevado ao cubo, raiz quadrada, raiz cúbica e o valor absoluto.
import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { 
            System.out.print("Informe um número inteiro: ");
            int num = input.nextInt();

            int resto = num % 2; // Resto da divisão por 2
            int E_cubo = (int) Math.pow(num, 3); // Elevado ao cubo
            float R_quadrada = (float) Math.sqrt(num); // Raiz quadrada
            float R_cubica = (float) Math.cbrt(num); // Raiz cúbica
            int valor_Abs = (int) Math.abs(num); // Valor Absoluto

            System.out.printf("Número: %d, \nResto da divisão: %d, \nElevado ao cubo: %d, \nRaiz quadrada: %.2f, \nRaiz cúbica: %.2f, \nValor absoluto: %d.\n", num, resto, E_cubo, R_quadrada, R_cubica, valor_Abs);
        }
    }
}
// Desenvolvido por Kaiky - 2025
