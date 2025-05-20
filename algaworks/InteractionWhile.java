public class InteractionWhile {
    public static void main(String[] args) {
        // int i = 0;
        // while (i < 10) {
        //     if (i==5) {
        //         System.out.println("Will stop!");
        //         break;
        //     }
        //     System.out.printf("Any phraser. %d\n", i);
        //     i++;
        int i = 0;
        while (i < 10) {
            i++;
            if (i==5) {
                System.out.println("Will continue...");
                continue;
            }
            System.out.println(i + ": Any phraser");

        }
    }
}
 