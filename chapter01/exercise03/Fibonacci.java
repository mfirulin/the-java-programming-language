//Exercise 1.3: Add a title to the printed list of the Fibonacci program.

public class Fibonacci {
    public static void main(String[] args) {
        long lo = 1;
        long hi = 1;
        System.out.println("fibonacci");
        System.out.println("---------");
        System.out.println(lo);
        while(hi < 50) {
            System.out.println(hi);
            hi += lo;
            lo = hi - lo;
        }   
    }
}
