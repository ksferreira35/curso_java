public class ex027 {
    public static void main(String[] args) {
        boolean val1 = (4 >= 5), val2 = (4 < 4), val3 = (val1 == val2);
        boolean val4 = val1 ^ val3;
        boolean val5 = !val2 && val4; 
        System.out.println(val4 + " " + val5);
        /* 
         * val1 = false
         * val2 = false
         * val3 = true
         * val4 = true
         * val5 = true
         * true true
         */
    }
}
