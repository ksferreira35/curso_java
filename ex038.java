
import java.util.Scanner;

public class ex038 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Digite o valor do primeiro lado: ");
            int a = input.nextInt();
            
            System.out.print("Digite o valor do segundo lado: ");
            int b = input.nextInt();
            
            System.out.print("Digite o valor do terceiro lado: ");
            int c = input.nextInt();

            // Verificando se é possível formar um triângulo
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Os valores formam um triângulo.");
                
                // Verificando o tipo do triângulo
                if (a == b && b == c) {
                    System.out.println("Tipo: Equilátero");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Tipo: Isósceles");
                } else {
                    System.out.println("Tipo: Escaleno");
                }
            } else {
                System.out.println("Os valores NÃO formam um triângulo.");
            }

            input.close();
        }        
    }
}
