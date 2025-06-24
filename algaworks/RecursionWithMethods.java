import java.util.Scanner;

public class RecursionWithMethods {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
		
            imprimirLinha();
            
            String cursoEscolhido = receberCursoDoUsuario(scanner);

            imprimirLinha();
            
            String formaPagamentoEscolhida = receberFormaDePagamento(scanner);
            
            imprimirLinha();
            
            imprimirTextoLn("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
        }
		
	}
    static String receberFormaDePagamento(Scanner scanner) {
        String[] formasPagamento = new String[] {"Cartão", "Boleto"};
        
        imprimirTextoLn("Escolha dentre as formas de pagamento abaixo: ");
        
        imprimirMenu(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida é: ", scanner);

        return formasPagamento[posicaoFormaPagamentoEscolhida];
    }

    static String receberCursoDoUsuario(Scanner scanner) {
        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
        
        imprimirTextoLn("Escolha dentre os cursos abaixo: ");
        
        imprimirMenu(cursos);
        
        Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "Seu curso escolhido é: ", scanner);

        return cursos[posicaoCursoEscolhido];
    }
    
    static Integer receberIndiceValidoDoUsuario(String[] vetor, String mensagem, Scanner scanner) {
        Integer indice = receberNumeroInteiroDoUsuario(mensagem, scanner);

        Boolean valido = verificarIndiceValido(indice, vetor);

        if (!valido) {
            encerrarProgramaPorCausaDeIndiceInvalido();
        }

        return indice;
    }

	static Integer receberNumeroInteiroDoUsuario(String msg, Scanner scanner) {
		imprimirTexto(msg);
		Integer numero = scanner.nextInt();

		return numero;
	}

    static void imprimirMenu(String[] array) {
        imprimirMenuRecursividade(array, 0);
    }

    static void imprimirMenuRecursividade(String[] array, Integer i) {
        imprimirTextoLn("[" + i + "] " + array[i]);

        if (++i < array.length) {
            imprimirMenuRecursividade(array, i);
        }
    }

    static void imprimirTexto(String msg) {
        System.out.print(msg);
    }

    static void imprimirTextoLn(String msg) {
        System.out.println(msg);
    }

	static void imprimirLinha() {
		System.out.println("----------------------------------------------");
	}

    static boolean verificarIndiceValido(Integer indice, String[] vetor) {
        return indice >= 0 && indice < vetor.length;
    }

    static void encerrarProgramaPorCausaDeIndiceInvalido() {
        System.err.println("Índice inválido! Encerrando o programa.");
        System.exit(1);
    }
}
