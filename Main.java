//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library(new ArrayList<>(), null);
        ArrayList<User> createdUsers = new ArrayList<>();

        System.out.println("Welcome to the Library System!");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Register User");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Borrowed Books");
            System.out.println("7. Find Book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = input.nextLine();
                    int id = createdUsers.size();  // auto ID
                    User user = new User(name, id, new ArrayList<>());
                    createdUsers.add(user);
                    library.registerUser(user, name);
                    System.out.println("Registered user with ID: " + id);
                    break;

                case 2:
                    System.out.print("Enter book type (1 = Book, 2 = Fiction, 3 = Non-Fiction): ");
                    int type = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    System.out.print("Enter pages: ");
                    int pages = input.nextInt();
                    System.out.print("Enter copies: ");
                    int copies = input.nextInt();
                    input.nextLine();

                    Book newBook;
                    if (type == 2) {
                        System.out.print("Enter genre: ");
                        String genre = input.nextLine();
                        newBook = new Fiction_Book(title, author, pages, copies, genre);
                    } else if (type == 3) {
                        System.out.print("Enter topic: ");
                        String topic = input.nextLine();
                        newBook = new Non_Fiction_Book(title, author, pages, copies, topic);
                    } else {
                        newBook = new Book(title, author, pages, copies);
                    }

                    library.addBook(newBook);
                    System.out.println("Book added: " + title);
                    break;

                case 3:
                    System.out.print("Enter title of the book to remove: ");
                    String removeTitle = input.nextLine();
                    library.removeBook(removeTitle);
                    System.out.println("Attempted to remove book.");
                    break;

                case 4:
                    System.out.print("Enter user ID: ");
                    int borrowId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter title of the book to borrow: ");
                    String borrowTitle = input.nextLine();
                    library.borrowBook(borrowId, borrowTitle);
                    break;

                case 5:
                    System.out.print("Enter user ID: ");
                    int returnId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter title of the book to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(returnId, returnTitle);
                    break;

                case 6:
                    System.out.print("Enter user ID: ");
                    int viewId = input.nextInt();
                    input.nextLine();
                    ArrayList<Book> borrowed = library.getBorrowedBooks(viewId);
                    if (borrowed != null && !borrowed.isEmpty()) {
                        System.out.println("Borrowed Books:");
                        for (Book b : borrowed) {
                            System.out.println("- " + b.getTitle());
                        }
                    } else {
                        System.out.println("No books borrowed or user not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter book title to find: ");
                    String findTitle = input.nextLine();
                    System.out.println("Search result: " + library.findBook(findTitle));
                    break;

                case 8:
                    System.out.println("Exiting. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option, try again.");
            }
        }

    }
}

