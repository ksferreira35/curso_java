// Programa que mostra que as variavels podem ser diferentes quando comparadas, mas usando o equals analisa o conteúdo do texto
public class ex022 {
    public static void main(String[] args) {
        String nome1 = "Kaiky";

        @SuppressWarnings("unused")
        String nome2 = "Kaiky";

        @SuppressWarnings("RedundantStringConstructorCall")
        String nome3 = new String("Kaiky");

        String res;
        res = (nome1.equals(nome3))?"Igual":"Diferente";
        
        System.out.println(res);
    }
}
// Desenvolvido por Kaiky - 2025
