package libraryManagementSystem;

public class LibraryBook {
    private final Book book;
    private boolean available;

    public LibraryBook(Book book) {
        this.book = book;
        this.available = true;
    }

    public Book getBook() {
        return book;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "book=" + book +
                ", available=" + available +
                '}';
    }
}



