// Programa que utiliza o operador ternário
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Usei o try so pra o input não ficar sublinhado.
            
            System.out.println("Número");
            int n2 = input.nextInt();
            int n1 = input.nextInt();

            int maior = n1 > n2 ? n1 : n2;

            System.out.println(maior);
        }    
    }
}
// Desenvolvido por Kaiky - 2025
