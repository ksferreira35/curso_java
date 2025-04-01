// Programa que ajuda na percepção do cálculo do programa com a utilização de métodos, podendo ajudar em concursos
public class ex070 {
    static int f1(int n) {
        return n % 2;
    }
    static int f2(int n) {
        return n * 2;
    }
    static int f3(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(f3(f1(3), f2(5)));
    }
}
// Desenvolvido por Kaiky - 2025
