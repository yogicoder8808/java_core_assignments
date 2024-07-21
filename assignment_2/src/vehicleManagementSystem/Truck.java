package vehicleManagementSystem;

public class Truck extends Vehicle{
	private int cargoCapacity; // in kilograms

    // Constructor
    public Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and Setter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Method specific to Truck
    public void loadCargo(int weight) {
        if (weight <= cargoCapacity) {
            System.out.println("Loading " + weight + " kg of cargo.");
        } else {
            System.out.println("Cargo exceeds capacity!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

}
