public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("title1","author1",200);
        b1.displayDetails();
        Book b2 = new Book("title2","author2",250);
        b1.displayDetails();
        // Task 5: Call the displayDetails method for each object.
    }
}

// Define the Book class
class Book {

    private String title;
    private String author;
    private int numberofPages;
    // Constructor
    public Book(String inittitle, String initauthor, int initnumberOfPages) {
        title = inittitle;
        author = initauthor;
        numberofPages = initnumberOfPages;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getnumberofPages() {
        return numberofPages;
    }

    public void displayDetails(
    ){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Number of pages: "+numberofPages);
    }
    // Task 3: Add a method displayDetails() to print the book's details (title, author, and numberOfPages).
}