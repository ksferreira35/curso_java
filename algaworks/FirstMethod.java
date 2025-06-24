import java.util.Scanner;

public class FirstMethod {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimirTextoMesmaLinha("Escolha dentre os cursos abaixo: ");
		
        imprimirMenu(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("Seu curso escolhido é: ", scanner);
		
        encerrarProgramaPorCausaDePosicaoInvalida(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimirTextoMesmaLinha("Escolha dentre as formas de pagamento abaixo: ");
		
        imprimirMenu(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);
		
        encerrarProgramaPorCausaDePosicaoInvalida(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}

    static void imprimirMenu(String[] array) {
        for(int i = 0; i < array.length; i++) {
        System.out.println("[" + i + "] " + array[i]);
		}
    }
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}

    static void encerrarProgramaPorCausaDePosicaoInvalida(Integer escolha, String[] cursos) {
        Boolean posicaoValida = escolha >= 0 && escolha < cursos.length; 
		
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
    }

    static void imprimirTexto(String msg) {
        System.out.print(msg);
    }

	static Integer receberNumeroInteiroDoUsuario(String msg, Scanner scanner) {
		imprimirTexto(msg);
		Integer numero = scanner.nextInt();

		return numero;
	}

	static void imprimirTextoMesmaLinha(String msg) {
		System.out.println(msg);
    }
}