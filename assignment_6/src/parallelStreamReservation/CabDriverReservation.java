package parallelStreamReservation;

public class CabDriverReservation implements Runnable{
	private String name;

    public CabDriverReservation(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Reserving a cab driver " + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cab Driver " + name + " reservation confirmed");
    }

}
