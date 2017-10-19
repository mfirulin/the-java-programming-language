public class ImprovedFibonacci {
    private static final int MAX = 50;

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        int i = 0;

        Storage[] storage = new Storage[MAX];
        storage[i] = new Storage();
        storage[i].a = lo;

        if(lo % 2 == 0)
            storage[i].even = true;
        else
            storage[i].even = false;

        ++i;
        while(hi < MAX) {
            storage[i] = new Storage();

            if(hi % 2 == 0)
                storage[i].even = true;
            else
                storage[i].even = false;

            storage[i].a = hi;

            hi += lo;
            lo = hi - lo;
            ++i;
        }

        for(i = 0; storage[i] != null && i < storage.length; ++i) {
            System.out.print((i + 1) + ": " + storage[i].a);
            if(storage[i].even)
                System.out.println(" *");
            else
                System.out.println();
        }
    }
}
