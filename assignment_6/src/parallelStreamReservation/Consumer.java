package parallelStreamReservation;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    private List<Runnable> orders;

    public Consumer(List<Runnable> orders) {
        this.orders = orders;
    }

    public void placeOrders() {
        orders.parallelStream().forEach(Runnable::run);
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
