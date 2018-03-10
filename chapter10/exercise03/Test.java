public class Test implements Runnable {
    private int value;
    
    private synchronized void add(int value) {
        this.value += value;
        System.out.println(this.value);
    }
    
    public void run() {
        try {
            for(;;) {
                add(1);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            return;
        }     
    }
    
    public static void main(String[] args) {
        Runnable test = new Test();
        new Thread(test).start();
        new Thread(test).start();
        new Thread(test).start();
    }
}
