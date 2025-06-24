import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Integer number = chooseTheNumber(scanner);

            exibirTabuada(number, 0);
        }
    }
    static void exibirTabuada(Integer number, Integer multiplication) {
        System.out.println(number + " x " + multiplication + " = " + (number * multiplication));

        if(++multiplication <= 10) {
            exibirTabuada(number, multiplication);
        }
    }

    static Integer chooseTheNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
}