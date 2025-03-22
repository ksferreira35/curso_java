// Programa que mostra uma sequência de 1 até 100, pulando de 10 em 10
public class ex050 {
    public static void main(String[] args) {
        for (int cc = 1; cc <= 100; cc++) { // Vai de 1 até 100
            if (cc % 10 == 0) { // Verifica se o número é divisível por 10, para não ter números como 1, 11, 21, 31 e etc
                System.out.println("Cambalhota " + cc);
            }
        }
    }
}
// Desenvolvido por Kaiky - 2025
