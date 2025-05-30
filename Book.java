/**
 * The {@code Book} class represents a book with basic details such as title, author,
 * number of pages, and available copies. It provides methods to borrow and return books,
 * as well as accessors and mutators for its fields.
 */
public class Book {

    /** The title of the book. */
    protected String title;

    /** The author of the book. */
    protected String author;

    /** The number of pages in the book. */
    protected int pages;

    /** The number of copies currently available. */
    protected int copies;

    /**
     * Constructs a {@code Book} with the specified title, author, number of pages, and copies.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param pages  the number of pages in the book
     * @param copies the number of available copies
     */
    public Book(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    /**
     * Checks if the book is available (i.e., there is at least one copy left).
     *
     * @return {@code true} if at least one copy is available, {@code false} otherwise
     */
    public boolean isAvailable() {
        return copies > 0;
    }

    /**
     * Borrows a copy of the book by decreasing the number of available copies by 1.
     * No check is done to ensure a copy is available before borrowing.
     */
    public void borrow() {
        copies--;
    }

    /**
     * Returns a copy of the book by increasing the number of available copies by 1.
     */
    public void returnBook() {
        copies++;
    }

    /**
     * Returns a string representation of the book, including title, author,
     * number of pages, and available copies.
     *
     * @return a descriptive string of the book's information
     */
    public String toString() {
        return title + " was written by " + author + " and is " + pages + " long, there are " + copies + " available";
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the number of pages in the book.
     *
     * @return the number of pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the number of pages in the book.
     *
     * @param pages the new number of pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}
