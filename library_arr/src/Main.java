import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private String borrowerName;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.borrowerName = null;
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished +
               (borrowerName != null ? ", Borrowed by: " + borrowerName : "");
    }

    public void updateBookInfo(String newTitle, String newAuthor, int newYearPublished) {
        this.title = newTitle;
        this.author = newAuthor;
        this.yearPublished = newYearPublished;
    }

    public void borrowBook(String borrowerName) {
        if (this.borrowerName == null) {
            this.borrowerName = borrowerName;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is already borrowed by " + this.borrowerName);
        }
    }

    public void returnBook() {
        if (this.borrowerName != null) {
            this.borrowerName = null;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getTitle() {
        return title;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
            new Book("To Kill a Mockingbird", "Harper Lee", 1960),
            new Book("1984", "George Orwell", 1949)
        };

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Display Library");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayLibrary(books);
                    break;
                case 2:
                    borrowBook(books, scanner);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    returnBook(books, titleToReturn);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayLibrary(Book[] books) {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    public static void borrowBook(Book[] books, Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        int index = findBookByTitle(books, title);
        if (index != -1) {
            System.out.print("Enter your name: ");
            String borrowerName = scanner.nextLine();
            books[index].borrowBook(borrowerName);
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void returnBook(Book[] books, String searchTitle) {
        int index = findBookByTitle(books, searchTitle);
        if (index != -1) {
            books[index].returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public static int findBookByTitle(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
}
