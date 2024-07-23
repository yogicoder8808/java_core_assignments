package bankingManagementSystem;

public class Customer {
    private String name;
    private String id;

    // Constructor
    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

