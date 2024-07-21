package libraryManagementSystem;

public class Staff {

	private String name;
    private String id;
    private String role;

    // Constructor
    public Staff(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    // Add a new member
    public void addMember(Member member) {
        System.out.println(name + " added new member: " + member.getName());
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}
