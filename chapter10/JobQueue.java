public class JobQueue {

    private static class Job {
        Job next;
        Object task;
        
        Job(Object task) {
            this.task = task;
        }
    }

    private Job head, tail;
    private int num;
    
    private synchronized void addJob(Object task) {
        var job = new Job(task);
        
        if (tail == null)
            head = job;
        else
            tail.next = job;
        
        job.next = null;
        tail = job;
        num++;
        
        notify(); // Wake any worker
    }
    
    private synchronized Object takeJob() throws InterruptedException {
        while (head == null)
            wait(); // Can throw InterruptedException
        
        var job = head;
        head = head.next;
        if (head == null)
            tail = null;
        
        num--;
        return job.task;
    }
    
    public void runManager() {
        var manager = new Runnable() {
            public void run() {
                try {
                    for (;;) {
                        addJob(new Object());
                        System.out.println("Manager adds a job. Queue length " + num);
                        Thread.sleep(500); // Can throw InterruptedException
                    }
                }
                catch (InterruptedException e) {
                    return;
                }
            }
        };
        
        new Thread(manager).start();
    }
    
    public void runWorker() {
        var worker = new Runnable() {
            public void run() {
                var str = "Worker " + Thread.currentThread().getId() + " takes a job";
                try {
                    for (;;) {
                        var task = takeJob();
                        System.out.println(str);
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
        var jq = new JobQueue();
        jq.runManager();
        for (int i = 0; i < 5; i++)
            jq.runWorker();
    }
}
