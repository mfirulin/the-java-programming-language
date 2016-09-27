public class Fibonacci {
    private static final int MAX = 50;
    private static final String head = "fibonacci\n---------"; 

    public static void main(String[] args) {
        long[] result = new long[MAX];
        long lo = 1;
        long hi = 1;
        int i = 0;

        System.out.println(head);
        result[i++] = lo;
        while(hi < MAX) {
            result[i++] = hi;
            hi += lo;
            lo = hi - lo;
        }

        for(i = 0; result[i] != 0 && i < result.length; ++i) {
            System.out.println(result[i]);
        }
    }
}
