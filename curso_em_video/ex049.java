// Programa que lê números inteiros, calcula estatísticas como total de valores, pares, ímpares, acima de 100, e a média, exibindo os resultados em uma interface gráfica usando o javax.
import javax.swing.JOptionPane;

public class ex049 {
    public static void main(String[] args) {
        int n, totalValores = 0, totalPares = 0, totalImpares = 0, acimaDe100 = 0;
        int soma = 0; // Vai ser usado para calcular a média

        do {
            // Usando JOptionPane para entrada de dados
            String inputString = JOptionPane.showInputDialog(null, "<html>Digite um número (0 para sair):</html>", "Entrada", JOptionPane.QUESTION_MESSAGE);
            n = Integer.parseInt(inputString);

            if (n != 0) {
                totalValores++;
                soma += n; // Somando os valores

                if (n % 2 == 0) {
                    totalPares++;
                } else {
                    totalImpares++;
                }

                if (n > 100) {
                    acimaDe100++;
                }
            }

        } while (n != 0);

        // Calculando a média
        double media = (totalValores > 0) ? (double) soma / totalValores : 0;

        // Usando o JOptions para poder mostrar os resultados em forma de tabela
        String resultado = "<html><h2>===== RESULTADOS =====</h2>" +
                           "<p>Total de valores digitados: " + totalValores + "</p>" +
                           "<p>Total de números pares: " + totalPares + "</p>" +
                           "<p>Total de números ímpares: " + totalImpares + "</p>" +
                           "<p>Quantidade acima de 100: " + acimaDe100 + "</p>" +
                           "<p>Média dos valores: " + media + "</p></html>";

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
// Desenvolvido por Kaiky - 2025
