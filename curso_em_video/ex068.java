// Programa que permite adicionar um valor na lista e depois apresenta um menu de opções para deixar em ordem, adiconar novos valores ou sair.
import java.util.Arrays;
import java.util.Scanner;

public class ex068 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet = criarLista(input);
        while (true) {
            // Exibir o vetor atual
            System.out.println("\nVetor atual:");
            for (int v : vet) {
                System.out.print(v + " ");
            }

            // Menu de opções
            String resposta;
            do {
                imprimirGuia();
                resposta = input.next();
                if (resposta.equals("1")) {
                    ordenarLista(vet);
                } else if (resposta.equals("2")) {
                    imprimirMensagem("Reiniciando e pedindo novos valores...");
                    vet = criarLista(input);
                    break;
                } else if (resposta.equalsIgnoreCase("q")) {
                    encerrarPrograma(); // Chamando a função sem fechar o Scanner

                } else {
                    imprimirMensagem("Entrada inválida. Tente novamente.");
                }

            } while (!resposta.equals("1") && !resposta.equals("2") && !resposta.equalsIgnoreCase("q"));
        }
    }

    public static void imprimirGuia() {
        System.out.println("\nProsseguir?");
        System.out.println("1 - Deixar em ordem");
        System.out.println("2 - Voltar do começo (inserir novos valores)");
        System.out.println("q - Quit");
        System.out.print("Resposta: ");
    }

    public static void imprimirMensagem(String mensagem) {
        imprimirLinha(20);
        System.out.println(mensagem);
        imprimirLinha(20);
    }

    public static void imprimirLinha(int repeticoes) {
        System.out.println("-=".repeat(repeticoes));
    }

    public static void ordenarLista(int[] lista) {
        Arrays.sort(lista); // Ordena o vetor
        imprimirLinha(20);
        System.out.println("Vetor em ordem crescente:");
        for (int v : lista) {
            System.out.print(v + " ");
        }
        System.out.println("\n" + "-=".repeat(20));
    }

    public static int[] criarLista(Scanner input) {
        int vet[] = new int[4];
        // Leitura dos 4 valores apenas uma vez
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite um valor para a posição (%d): ", i);
            vet[i] = input.nextInt();
        }
        return vet;
    }

    public static void encerrarPrograma() {
        imprimirLinha(20);
        System.out.println("Encerrando o programa...");
        imprimirLinha(20);
        System.exit(0);
    }
}
// Desenvolvido por Kaiky - 2025
