package parallelStreamReservation;

public class CabDriverReservation implements Runnable {
    private final String name;

    public CabDriverReservation(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Reserving a cab driver: " + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Reservation for cab driver " + name + " was interrupted.");
            return;
        }
        System.out.println("Cab Driver " + name + " reservation confirmed");
    }
}

