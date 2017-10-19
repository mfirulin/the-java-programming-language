public class ImprovedFibonacci {
    private static final int MAX = 50;

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        int i = 0;
        String mark;
        String[] storage = new String[MAX];

        storage[i] = "1: " + lo;
        ++i;
        while(hi < MAX) {
            if(hi % 2 == 0)
                mark = " *";
            else
                mark = "";

            storage[i] = i + ": " + hi + mark;
            hi += lo;
            lo = hi - lo;
            ++i;
        }

        for(i = 0; storage[i] != null && i < MAX; ++i) {
            System.out.println(storage[i]);
        }
    }
}
