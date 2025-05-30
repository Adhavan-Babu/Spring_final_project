import java.util.ArrayList;

/**
 * The {@code User} class represents a library user who can borrow and return books.
 */
public class User {

    /** The name of the user. */
    private String name;

    /** The unique ID of the user. */
    private int id;

    /** The list of books currently borrowed by the user. */
    private ArrayList<Book> borrowedBooks;

    /**
     * Constructs a {@code User} with the specified name, ID, and list of borrowed books.
     *
     * @param name           the name of the user
     * @param id             the unique ID of the user
     * @param borrowedBooks  the list of books currently borrowed by the user
     */
    public User(String name, int id, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }

    /**
     * Adds a book to the user's list of borrowed books.
     *
     * @param book the book to borrow
     */
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    /**
     * Removes a book from the user's list of borrowed books.
     *
     * @param book the book to return
     */
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    /**
     * Returns the list of books currently borrowed by the user.
     *
     * @return the list of borrowed books
     */
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Returns the name of the user.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the ID of the user.
     *
     * @return the user's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns a string representation of the user, including their name, ID,
     * and currently borrowed books.
     *
     * @return a string describing the user
     */
    public String toString() {
        return name + " has a user id of " + id + " and is currently borrowing " + borrowedBooks;
    }
}
