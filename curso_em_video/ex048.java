// Programa que mostra um numero sequencial de 1 até 4 utilizando, estruturas de codição e repetição.
public class ex048 {
    public static void main(String[] args) {
        int c = 1;
        do {
            if (c % 5 != 0) System.out.print((c + " "));
            else break;
            c += 1;
        } while (c <= 10);
    }
}
// Desenvolvido por Kaiky - 2025
