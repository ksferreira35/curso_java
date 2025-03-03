// Programa que permite uma entrada de dados para nome e nota.
import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) { // Usei o try so pra o teclado não ficar sublinhado.
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            System.out.printf("A nota de %s é %.1f \n", nome, nota);
        }
    }
}
// Desenvolvido por Kaiky - 2025
