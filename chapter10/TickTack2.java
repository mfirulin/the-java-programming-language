public class TickTack2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
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
        var thread = new Thread(new TickTack2());
        thread.start();
        
        try {
            thread.join();
            System.out.println("Job ended");
        }
        catch (InterruptedException e) {
        }
    }
}
