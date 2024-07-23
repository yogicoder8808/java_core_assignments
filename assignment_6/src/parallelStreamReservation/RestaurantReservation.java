package parallelStreamReservation;

public class RestaurantReservation implements Runnable {
    private String restaurantName;

    public RestaurantReservation(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void run() {
        System.out.println("Reserving a table at " + restaurantName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reservation confirmed at " + restaurantName);
    }
}
