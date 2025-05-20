public class ImparNumbersWithWhile {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int i = 0;

        while(i < numbers.length) {
            if(numbers[i] % 2 != 0) {
                System.out.println(numbers[i] + " is impar!");
            }

            i++;
        }
    }
}