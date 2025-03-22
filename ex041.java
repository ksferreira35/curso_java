// Programa que mostra um texto sequencial de Cambalhotas 1, 2, 3 e 5 descartando o 6, 4 e ~10 e no 7 ele quebra o loop
public class ex041 {
    public static void main(String[] args) {
        int cc = 0;
        
        while (cc<10) {
            cc++;

            if (cc == 6 || cc == 4 || cc == 10) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}
// Desenvolvido por Kaiky - 2025
