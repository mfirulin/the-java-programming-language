import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class ThreadSpecificData {  
    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);
    
    // Thread local variable containing each thread's ID
    private static final ThreadLocal<Integer> threadId =
        new ThreadLocal<Integer>() {
            @Override protected Integer initialValue() {
                return nextId.getAndIncrement();
        }
    };
    
    public ThreadSpecificData() {
        Runnable worker = new Runnable() {
            public void run() {
                try (PrintWriter out = new PrintWriter("ThreadSpecificData" + threadId.get() + ".log")) {
                        out.println("Thread started");
                }
                catch (FileNotFoundException e) {
                    return;
                }
                
                try {
                    for (;;) {
                        Thread.sleep(10);
                    }
                }
                catch (InterruptedException e) {
                    return;
                }
            }
        };
        new Thread(worker).start();
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            new ThreadSpecificData();
    }
}
