/**
 * The {@code Fiction_Book} class represents a fictional book, extending the base {@code Book} class.
 * It adds a {@code genre} field specific to fiction books.
 */
public class Fiction_Book extends Book {

    /** The genre of the fiction book (e.g., Fantasy, Sci-Fi, Mystery). */
    private String genre;

    /**
     * Constructs a {@code Fiction_Book} with the specified title, author, number of pages, copies, and genre.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param pages  the number of pages in the book
     * @param copies the number of available copies
     * @param genre  the genre of the fiction book
     */
    public Fiction_Book(String title, String author, int pages, int copies, String genre) {
        super(title, author, pages, copies);
        this.genre = genre;
    }

    /**
     * Gets the genre of the fiction book.
     *
     * @return the genre of the book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the fiction book.
     *
     * @param genre the new genre of the book
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns a string representation of the fiction book, including title, author,
     * number of pages, genre, and available copies.
     *
     * @return a descriptive string of the fiction book's information
     */
    @Override
    public String toString() {
        return title + " was written by " + author + " and is " + pages + " long, its genre is " + genre + " , there are " + copies + " available";
    }
}
