package libraryManagementSystem;

public class LibraryManagementSystem {

	public static void main(String[] args) {

        Book book1 = new Book("Secret", "Rhonda Byrne", "978-1-84737-029-7");
        Book book2 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", "978-161268-113-9");

        Staff staff = new Staff("Yogi", "S001", "Librarian");
        Member member = new Member("A Yogesh", "M001");


        staff.addMember(member);

        member.borrowBook(book1);
        member.borrowBook(book2);

        member.returnBook(book1);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(member);
        System.out.println(staff);
    }

}
