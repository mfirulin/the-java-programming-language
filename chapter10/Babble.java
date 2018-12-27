public class Babble extends Thread {
    private static boolean doYield;
    private static int howOften;
    
    private String word;
    
    Babble(String word) {
        this.word = word;
    }
    
    public void run() {
        for (int i = 0; i < howOften; ++i) {
            System.out.println(word);
            if (doYield)
                Thread.yield();
        }
    }
    
    public static void main(String[] args) {
        doYield = new Boolean(args[0]).booleanValue();
        howOften = Integer.parseInt(args[1]);
        
        for (int i = 2; i < args.length; ++i)
            new Babble(args[i]).start();
    }
}
