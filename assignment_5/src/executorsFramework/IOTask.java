package executorsFramework;

public class IOTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Performing I/O task at: " + new java.util.Date());
    }
}

