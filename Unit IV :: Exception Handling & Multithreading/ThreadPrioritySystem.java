// 20.	Thread Priority System
// Create a class ThreadPrioritySystem. Create multiple threads and assign  different priorities and observe execution order.
// Output: Thread execution messages.

class WorkerThread extends Thread {
    public WorkerThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + getName() + 
                               " | Priority: " + getPriority() + 
                               " | Iteration: " + i);
            try {
                Thread.sleep(100); // simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " finished execution.");
    }
}

public class ThreadPrioritySystem {
    public static void main(String[] args) {
        // Create threads with different priorities
        WorkerThread t1 = new WorkerThread("LowPriorityThread", Thread.MIN_PRIORITY);   // Priority 1
        WorkerThread t2 = new WorkerThread("MediumPriorityThread", Thread.NORM_PRIORITY); // Priority 5
        WorkerThread t3 = new WorkerThread("HighPriorityThread", Thread.MAX_PRIORITY);  // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}