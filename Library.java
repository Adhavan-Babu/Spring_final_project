import java.util.ArrayList;
import java.util.HashMap;

/**
 * The {@code Library} class represents a library that holds a collection of books and users.
 * It provides functionality for adding/removing books, registering users, borrowing, and returning books.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    /**
     * Constructs a {@code Library} with an initial list of books.
     *
     * @param books     the list of books to initialize the library with
     * @param usernames a map of usernames to users (currently unused)
     */
    public Library(ArrayList<Book> books, HashMap<String, User> usernames) {
        this.books = books;
        this.users = users;
    }

    /**
     * Adds a book to the library's collection.
     *
     * @param book the book to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library based on its title.
     *
     * @param title the title of the book to remove
     */
    public void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
            }
        }
    }

    /**
     * Registers a new user to the library system.
     *
     * @param user the user to register
     * @param name the name of the user (currently unused)
     */
    public void registerUser(User user, String name) {
        users.add(user);
    }

    /**
     * Searches for a book by its title.
     *
     * @param title the title of the book to find
     * @return the title of the book if found, otherwise "Book not found"
     */
    public String findBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                return books.get(i).getTitle();
            }
        }
        return "Book not found";
    }

    /**
     * Allows a user to borrow a book based on their ID and the book's title.
     *
     * @param id    the ID of the user
     * @param title the title of the book to borrow
     */
    public void borrowBook(int id, String title) {
        User user = users.get(id);

        for (User u : users) {
            if (u.getId() != id) {
                return;
            }
        }

        for (Book b : books) {
            Book bookBorrowed = null;
            if (b.getTitle().equals(title)) {
                bookBorrowed = b;
                break;
            } else if (!b.getTitle().equals(null)) {
                System.out.println("Book not found at this library");
                return;
            } else if (!b.isAvailable()) {
                System.out.println("Book is currently not availible, please check back later");
                return;
            }
            bookBorrowed.borrow();
            user.borrowBook(bookBorrowed);

            System.out.println("You have borrowed a book!");
        }
    }

    /**
     * Allows a user to return a previously borrowed book.
     *
     * @param id    the ID of the user
     * @param title the title of the book to return
     */
    public void returnBook(int id, String title) {
        User user = users.get(id);

        for (User u : users) {
            if (u.getId() == id) {
                user = u;
                break;
            }
        }

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        Book bookToReturn = null;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                bookToReturn = b;
                break;
            }
        }

        if (bookToReturn == null) {
            System.out.println("Book was never borrowed.");
            return;
        }

        for (Book libBook : books) {
            if (libBook.getTitle().equalsIgnoreCase(title)) {
                libBook.returnBook();
                break;
            }
        }

        user.returnBook(bookToReturn);
        System.out.println(user.getName() + " has returned '" + title + "'.");
    }

    /**
     * Retrieves the list of books borrowed by a user.
     *
     * @param id the ID of the user
     * @return a list of books borrowed by the user, or {@code null} if user is not found
     */
    public ArrayList<Book> getBorrowedBooks(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return u.getBorrowedBooks();
            }
        }
        return null;
    }
}
