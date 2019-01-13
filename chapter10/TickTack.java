public class TickTack implements Runnable {
    @Override
    public void run() {
        try {
            for (;;) {
                System.out.print(".");
                System.out.flush();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.err.println("Job interrupted");
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args) {
        var thread = new Thread(new TickTack());
        thread.start();
        
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
        }
        
        thread.interrupt();
    }
}
