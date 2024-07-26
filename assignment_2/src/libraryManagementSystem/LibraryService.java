package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private final Map<String, LibraryBook> books = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.isbn(), new LibraryBook(book));
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void borrowBook(String memberId, String bookIsbn) {
        LibraryBook libraryBook = books.get(bookIsbn);
        Member member = members.get(memberId);

        if (libraryBook == null || member == null) {
            System.out.println("Book or member not found.");
            return;
        }

        if (libraryBook.isAvailable()) {
            libraryBook.setAvailable(false);
            member.addBorrowedBook(libraryBook);
            System.out.println(member.getName() + " borrowed " + libraryBook.getBook().title());
        } else {
            System.out.println(libraryBook.getBook().title() + " is not available.");
        }
    }

    public void returnBook(String memberId, String bookIsbn) {
        LibraryBook libraryBook = books.get(bookIsbn);
        Member member = members.get(memberId);

        if (libraryBook == null || member == null) {
            System.out.println("Book or member not found.");
            return;
        }

        if (member.removeBorrowedBook(libraryBook)) {
            libraryBook.setAvailable(true);
            System.out.println(member.getName() + " returned " + libraryBook.getBook().title());
        } else {
            System.out.println(member.getName() + " does not have " + libraryBook.getBook().title());
        }
    }

    @Override
    public String toString() {
        return "LibraryService{" + "books=" + books + '}';
    }
}










