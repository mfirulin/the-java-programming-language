public class Test implements Runnable {
    private int value;
    
    private  void add(int value) {
        this.value += value;
        System.out.println(this.value);
    }
    
    public synchronized void run() {
        try {
            for(;;) {
                add(1);
                Thread.sleep(10);
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
