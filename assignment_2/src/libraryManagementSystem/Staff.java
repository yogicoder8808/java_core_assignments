package libraryManagementSystem;

public class Staff {
    private final String name;
    private final String id;
    private final String role;

    public Staff(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void addMember(Member member, LibraryService service) {
        service.addMember(member);
        System.out.println(name + " "+ role + " added new member: " + member.getName());
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













//public class Staff {
//
//	private String name;
//    private String id;
//    private String role;
//
//    // Constructor
//    public Staff(String name, String id, String role) {
//        this.name = name;
//        this.id = id;
//        this.role = role;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void addMember(Member member) {
//        System.out.println(name + " added new member: " + member.getName());
//    }
//
//    @Override
//    public String toString() {
//        return "Staff{" +
//                "name='" + name + '\'' +
//                ", id='" + id + '\'' +
//                ", role='" + role + '\'' +
//                '}';
//    }
//
//}
