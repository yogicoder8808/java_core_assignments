package vehicleManagementSystem;

public class Car extends Vehicle{
	private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and Setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Method specific to Car
    public void openTrunk() {
        System.out.println("The trunk is now open.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}