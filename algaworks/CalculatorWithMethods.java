
import java.util.Scanner;

public class CalculatorWithMethods {

    static final String[] OPERACOES = new String[] {"Adição", "Subtração", "Multiplicação", "Divisão"};

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Double number1 = informeONumero(scanner);

            imprimirLinha();

            Integer operacao = chooseAnOperation(scanner);

            imprimirLinha();

            Double number2 = informeONumero(scanner);

            Double resultado = realizarCalculo(operacao, number1, number2);

            imprimirLinha();

            imprimirResultado(resultado);
            
            imprimirLinha();
        }
    }

    static Double informeONumero (Scanner scanner) {
        System.out.print("Informe um número: ");
        return scanner.nextDouble();
    }

    static Integer chooseAnOperation(Scanner scanner) {
        System.out.println("Escolha a operação: ");

        for(int i = 0; i < OPERACOES.length; i++) {
            System.out.println("[" + i + "]" + OPERACOES[i]);
        }

        System.out.print("Qual o número da operação? ");
        Integer escolha = scanner.nextInt();

        if (escolha < 0 || escolha >= OPERACOES.length) {
            System.err.println("Operação Inválida!");
            System.exit(1);
        }

        return escolha;
    }

    static Double adicao(Double number1, Double number2) {
        return number1 + number2;
    } 

    static Double subtracao(Double number1, Double number2) {
        return number1 - number2; 
    }

    static Double multiplicacao(Double number1, Double number2) {
        return number1 * number2;
    }

    static Double divisao(Double number1, Double number2) {
        if (number2 == 0) {
            System.err.println("Erro: Divisão por zero.");
            System.exit(1);
        }
        return number1 / number2;
    }

    static Double realizarCalculo(Integer operacao, Double number1, Double number2) {
        return switch (operacao) {
            case 0 -> adicao(number1, number2);
            case 1 -> subtracao(number1, number2);
            case 2 -> multiplicacao(number1, number2);
            case 3 -> divisao(number1, number2);
            default -> {
                System.err.println("Operação inválida!");
                System.exit(1);
                yield 0.0;
            }
        };
    }

    static void imprimirLinha() {
        System.out.println("-----------------------------------------------------");
    }

    static void imprimirResultado(Double resultado) {
        System.out.println("O resultado é igual a " + resultado);
    }
}