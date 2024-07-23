package parallelStreamReservation;

public class FlowerCakeOrder implements Runnable {
    private String item;

    public FlowerCakeOrder(String item) {
        this.item = item;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order confirmed for " + item);
    }
}
