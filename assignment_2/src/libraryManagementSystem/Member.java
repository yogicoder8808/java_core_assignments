package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final String id;
    private final List<LibraryBook> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<LibraryBook> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    void addBorrowedBook(LibraryBook libraryBook) {
        borrowedBooks.add(libraryBook);
    }

    boolean removeBorrowedBook(LibraryBook libraryBook) {
        return borrowedBooks.remove(libraryBook);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}














//import java.util.ArrayList;
//import java.util.List;
//
//public class Member {
//
//	private String name;
//    private String id;
//    private List<Book> borrowedBooks;
//
//    // Constructor
//    public Member(String name, String id) {
//        this.name = name;
//        this.id = id;
//        this.borrowedBooks = new ArrayList<>();
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
//    public List<Book> getBorrowedBooks() {
//        return borrowedBooks;
//    }
//
//    public void borrowBook(Book book) {
//        if (book.isAvailable()) {
//            book.setAvailable(false);
//            borrowedBooks.add(book);
//            System.out.println(name + " borrowed " + book.getTitle());
//        } else {
//            System.out.println(book.getTitle() + " is not available.");
//        }
//    }
//
//    public void returnBook(Book book) {
//        if (borrowedBooks.remove(book)) {
//            book.setAvailable(true);
//            System.out.println(name + " returned " + book.getTitle());
//        } else {
//            System.out.println(name + " does not have " + book.getTitle());
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "name='" + name + '\'' +
//                ", id='" + id + '\'' +
//                ", borrowedBooks=" + borrowedBooks +
//                '}';
//    }
//
//}
