/**
 * The {@code Non_Fiction_Book} class represents a non-fiction book in the library.
 * It extends the {@code Book} class and includes a specific topic.
 */
public class Non_Fiction_Book extends Book {

    /** The topic or subject the book focuses on. */
    private String topic;

    /**
     * Constructs a {@code Non_Fiction_Book} with the specified title, author, pages, copies, and topic.
     *
     * @param title  the title of the book
     * @param author the author of the book
     * @param pages  the number of pages in the book
     * @param copies the number of copies available
     * @param topic  the subject or topic of the non-fiction book
     */
    public Non_Fiction_Book(String title, String author, int pages, int copies, String topic) {
        super(title, author, pages, copies);
        this.topic = topic;
    }

    /**
     * Gets the topic of the non-fiction book.
     *
     * @return the topic of the book
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the topic of the non-fiction book.
     *
     * @param topic the new topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Returns a string representation of the non-fiction book,
     * including title, author, page count, topic, and number of copies available.
     *
     * @return a string describing the non-fiction book
     */
    @Override
    public String toString() {
        return title + " was written by " + author + " and is " + pages + " long, it focuses on " + topic + "there are " + copies + " available";
    }
}
