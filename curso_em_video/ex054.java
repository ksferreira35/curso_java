// Programa que mostra a quantidade de dias em cada mês.
public class ex054 {
    public static void main(String[] args) {
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < meses.length; i++) {
            System.out.println("* " + meses[i] + " tem " + diasMes[i] + " dias. ");
        }
    }
}
// Desenvolvido por Kaiky - 2025
