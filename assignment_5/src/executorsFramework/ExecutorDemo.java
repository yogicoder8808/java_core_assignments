package executorsFramework;
import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Using ThreadPoolExecutor:");
        useThreadPoolExecutor();

        System.out.println("\nUsing ScheduledThreadPoolExecutor:");
        useScheduledThreadPoolExecutor();

        System.out.println("\nUsing ForkJoinPool:");
        useForkJoinPool();
    }

    // ThreadPoolExecutor
    public static void useThreadPoolExecutor() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 5; i++) {
            Future<Integer> future = executorService.submit(new ComputationTask(i));
            System.out.println("Result of task " + i + ": " + future.get());
        }

        executorService.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");
    }

    // ScheduledThreadPoolExecutor
    public static void useScheduledThreadPoolExecutor() throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
		scheduledExecutorService.scheduleAtFixedRate(
                new IOTask(), 1, 3, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
    }

    // ForkJoinPool
    public static void useForkJoinPool() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask task = new SumTask(0, 100);
        Long result = forkJoinPool.invoke(task);

        System.out.println("Sum of numbers from 0 to 100: " + result);
    }
}


