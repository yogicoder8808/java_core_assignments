package libraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        Book book1 = new Book("Secret", "Rhonda Byrne", "978-1-84737-029-7");
        Book book2 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", "978-161268-113-9");

        libraryService.addBook(book1);
        libraryService.addBook(book2);
        
        System.out.println(book1);
        System.out.println(book2);

        Staff staff = new Staff("Yogi", "S001", "Librarian");
        System.out.println(staff);
        Member member = new Member("Yogesh", "M001");

        staff.addMember(member, libraryService);

        libraryService.borrowBook(member.getId(), book1.isbn());
        libraryService.borrowBook(member.getId(), book2.isbn());

        libraryService.returnBook(member.getId(), book1.isbn());

        System.out.println(libraryService);
        System.out.println(member);
        
    }
}











