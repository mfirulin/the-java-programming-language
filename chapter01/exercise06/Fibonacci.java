// Exercise 1.6: Change your program from Exercise 1.3 to use a named string constant for the title.

public class Fibonacci {
    private static final int MAX = 50;
    private static final String head = "fibonacci%n---------%n"; 

    public static void main(String[] args) {
        long lo = 1;
        long hi = 1;

        System.out.printf(head);
        System.out.println(lo);
        while(hi < MAX) {
            System.out.println(hi);
            hi += lo;
            lo = hi - lo;
        }
    }
}
