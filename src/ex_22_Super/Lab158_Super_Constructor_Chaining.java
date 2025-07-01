package ex_22_Super;

public class Lab158_Super_Constructor_Chaining {
    public static void main(String[] args) {
        Book b = new Book();
    }
}
class Book {
    String title;
    double price;

    Book() {
        this("Unknown", 0.0); // Calls the parameterized constructor in the same class
        System.out.println("Default constructor called");
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
        System.out.println("Book: " + title + ", Price: $" + price);
    }
}
