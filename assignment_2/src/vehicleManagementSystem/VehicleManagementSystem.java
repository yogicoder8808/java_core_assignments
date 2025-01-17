package vehicleManagementSystem;

public class VehicleManagementSystem {

	public static void main(String[] args) {
        Car car = new Car("Toyota", "SUV", 2022, 4);
        Truck truck = new Truck("Ford", "F-150", 2021, 2000);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2023, "Cruiser");

        // Test methods
        car.displayInfo();
        car.accelerate();
        car.openTrunk();
        System.out.println();

        truck.displayInfo();
        truck.brake();
        truck.loadCargo(1500);
        System.out.println();

        motorcycle.displayInfo();
        motorcycle.accelerate();
        motorcycle.performWheelie();

	}

}
