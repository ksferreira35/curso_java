// Programa que recebe valores finitos até o usuário digitar N para cancelar e calcular os valores digitados.
import java.util.Scanner;

public class ex046 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n, s = 0;
            String resp;
            
            do {
                System.out.print("Digite um número: ");
                n = input.nextInt();
                s += n;

                System.out.print("Quer continuar? [S/N] ");
                resp = input.next();

            } while (resp.equalsIgnoreCase("S"));

            input.close();
            System.out.println("A soma de todos os valores é " + s);
        }    
    }
}
// Desenvolvido por Kaiky - 2025
