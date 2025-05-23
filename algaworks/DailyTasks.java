import java.util.Scanner;

@SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.

public class DailyTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = new String[5];
        final int size = tasks.length;

        System.out.println("Enter the tasks you want to log: ");
        for (int i = 0; i < size; i++) {
            System.out.print("[ " + i + " ] ");
            tasks[i] = scanner.nextLine();
        }

        System.out.println("Your tasks are: ");
        for (int t = 0; t < size; t++) {
            System.out.println("[" + (t+1) + "]" + tasks[t]);
        }


        scanner.close();
    }   
}
