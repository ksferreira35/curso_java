package cap5;

import java.util.Scanner;

public class PublicExamination {
    static final int MIN_TOTAL_SCORE = 150;
    static final int MIN_TOTAL_EXAMS = 60;

    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float exam1;
        float exam2;
        float totalScore;
        
        exam1 = readScore(scanner, "What is your score in the first exam? ");
        exam2 = readScore(scanner, "What is your score in the second exam? ");

        totalScore = exam1 + exam2;

        if (totalScore >= MIN_TOTAL_SCORE && exam1 >= MIN_TOTAL_EXAMS && exam2 >= MIN_TOTAL_EXAMS) {
            System.out.printf("Congratulations, you passed with a score of %.1f.\n", totalScore);
        } else {
            System.out.printf("Unfortunately, you did not pass. Your score was %.1f.\n", totalScore);
        }

        scanner.close();
    }

    public static float readScore(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextFloat();
    }
}
