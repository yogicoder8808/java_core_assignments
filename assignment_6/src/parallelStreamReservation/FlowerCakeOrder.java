package parallelStreamReservation;

public class FlowerCakeOrder implements Runnable {
    private final String item;

    public FlowerCakeOrder(String item) {
        this.item = item;
    }

    @Override
    public void run() {
        System.out.println("Placing order for: " + item);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Order for " + item + " was interrupted.");
            return;
        }
        System.out.println("Order confirmed for " + item);
    }
}

