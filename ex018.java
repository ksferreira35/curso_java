// Programa que facilita o entendimento da classe Math, na parte de Arredondamento
public class ex018 {
    public static void main(String[] args) {

        float a = 3.9f;
        float b = 4.2f;
        float c = 5.51f;

        int ab = (int) Math.floor(a); // Arredondamento pra baixo
        int ac = (int) Math.ceil(b); // Arredondamento pra cima
        int aa = (int) Math.round(c); // Arredondamento Aritimétrico

        System.out.println(ab);
        System.out.println(ac);
        System.out.println(aa);
    }
}
// Desenvolvido por Kaiky - 2025
