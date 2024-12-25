import java.util.Arrays;
import java.util.stream.Collectors;

public class Book {
    private String name;
    private final Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        return Arrays.stream(authors)
                .map(Author::getName)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        String authorsString = Arrays.stream(authors)
                .map(Author::toString)
                .collect(Collectors.joining(","));
        return "Book[name=" + name + ",authors={" + authorsString + "},price=" + price + ",qty=" + qty + ']';
    }
}

