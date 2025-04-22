
import java.util.Scanner;

public class StudentGrade {
    static final double MIN_GRADE_TO_PASS = 70;

    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        double studentGrade = scanner.nextDouble();
        
        boolean passed = studentGrade >= MIN_GRADE_TO_PASS;

        if (passed) {
            System.out.println("Congratulations! You passed the year! ");
        } else {
            System.out.println("Unfortunately, you have to take a remedial exam.");
        }

        scanner.close();
    }
}
