public class MyThread extends Thread {

    private String name;
    private int delay;
    
    public MyThread(int delay) {
        this.delay = delay;
    }
    
    public void run() {
        try {
            name = super.getName();
            for(;;) {
                System.out.print(name + " ");
                Thread.sleep(delay);
            }
        }
        catch (InterruptedException e) {
            return;
        }
    }
    
    public static void main(String[] args) {
        MyThread mt1 = new MyThread(33);
        mt1.setName("first");
        MyThread mt2 = new MyThread(100);
        mt2.setName("secon");
        
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        
        mt1.start();
        mt2.start();
    }
}
