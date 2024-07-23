package threadLifecycle;

public class ThreadLifecycleDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Task1"));
        Thread thread2 = new Thread(new Task("Task2"));

        System.out.println("State of thread1 after creation: " + thread1.getState()); 
        System.out.println("State of thread2 after creation: " + thread2.getState()); 

        thread1.start(); 
        thread2.start(); 

        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread1 during execution: " + thread1.getState()); 
        System.out.println("State of thread2 during execution: " + thread2.getState()); 

        // Interrupt thread2
        thread2.interrupt();

        try {
            thread1.join(); 
            thread2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread1 after completion: " + thread1.getState()); // TERMINATED
        System.out.println("State of thread2 after completion: " + thread2.getState()); // TERMINATED
    }

    static class Task implements Runnable {
        private final String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is in RUNNABLE state.");
                Thread.sleep(2000); 

                synchronized (lock) {
                    System.out.println(name + " is in WAITING state.");
                    lock.wait(); 
                }
            } catch (InterruptedException e) {
                System.out.println(name + " was INTERRUPTED.");
            }

            System.out.println(name + " is now TERMINATED.");
        }
    }
}

