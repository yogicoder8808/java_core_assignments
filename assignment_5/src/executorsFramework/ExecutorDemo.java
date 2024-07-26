package executorsFramework;
import java.util.concurrent.*;

public class ExecutorDemo {

	public static void main(String[] args) {
        try {
            System.out.println("Using ThreadPoolExecutor:");
            useThreadPoolExecutor();

            System.out.println("\nUsing ScheduledThreadPoolExecutor:");
            useScheduledThreadPoolExecutor();

            System.out.println("\nUsing ForkJoinPool:");
            useForkJoinPool();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // ThreadPoolExecutor
	public static void useThreadPoolExecutor() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        long startTime = System.currentTimeMillis();

        try {
            for (int i = 1; i <= 5; i++) {
                Future<Integer> future = executorService.submit(new ComputationTask(i));
                System.out.println("Result of task " + i + ": " + future.get());
            }
        } finally {
            executorService.shutdown();
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                System.err.println("Executor did not terminate");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");
    }

	// ScheduledThreadPoolExecutor
    public static void useScheduledThreadPoolExecutor() throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        try {
            scheduledExecutorService.scheduleAtFixedRate(
                    new IOTask(), 1, 3, TimeUnit.SECONDS);
            Thread.sleep(10000); // Allow some time for scheduled tasks
        } finally {
            scheduledExecutorService.shutdown();
            if (!scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduledExecutorService.shutdownNow();
                System.err.println("ScheduledExecutorService did not terminate");
            }
        }
    }

    // ForkJoinPool
    public static void useForkJoinPool() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        try {
            SumTask task = new SumTask(0, 100);
            Long result = forkJoinPool.invoke(task);
            System.out.println("Sum of numbers from 0 to 100: " + result);
        } finally {
            forkJoinPool.shutdown();
            if (!forkJoinPool.isTerminated()) {
                forkJoinPool.shutdownNow();
            }
        }
    }
}


