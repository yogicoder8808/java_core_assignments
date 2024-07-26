package parallelStreamReservation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Consumer {
    private final List<Runnable> orders;

    public Consumer(List<Runnable> orders) {
        this.orders = orders;
    }

    public void placeOrders() {
        ExecutorService executor = Executors.newFixedThreadPool(orders.size());
        try {
            for (Runnable order : orders) {
                executor.submit(order);
            }
            executor.shutdown();
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                System.err.println("Executor did not terminate");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
            System.err.println("Executor was interrupted: " + e.getMessage());
        } finally {
            executor.shutdownNow();
        }
    }

    public static void main(String[] args) {
        RestaurantReservation restaurantReservation = new RestaurantReservation("The Gourmet Kitchen");
        FlowerCakeOrder flowerCakeOrder = new FlowerCakeOrder("Birthday Cake");
        CabDriverReservation cabDriverReservation = new CabDriverReservation("Devaraj");

        List<Runnable> orders = Arrays.asList(restaurantReservation, flowerCakeOrder, cabDriverReservation);

        Consumer consumer = new Consumer(orders);
        consumer.placeOrders();
    }
}

