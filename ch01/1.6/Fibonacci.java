class Fibonacci {
    static final int MAX = 50;
    static final String head = "fibonacci\n---------"; 

    public static void main(String[] args) {
    	long lo = 1;
    	long hi = 1;

    	System.out.println(head);
    	System.out.println(lo);
    	while(hi < MAX) {
    	    System.out.println(hi);
    	    hi += lo;
    	    lo = hi - lo;
	    }
    }
}
