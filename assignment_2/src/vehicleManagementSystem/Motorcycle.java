package vehicleManagementSystem;

public class Motorcycle extends Vehicle{
	private String handlebarType;

    // Constructor
    public Motorcycle(String make, String model, int year, String handlebarType) {
        super(make, model, year);
        this.handlebarType = handlebarType;
    }

    // Getter and Setter
    public String getHandlebarType() {
        return handlebarType;
    }

    public void setHandlebarType(String handlebarType) {
        this.handlebarType = handlebarType;
    }

    // Method specific to Motorcycle
    public void performWheelie() {
        System.out.println("Performing a wheelie!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}