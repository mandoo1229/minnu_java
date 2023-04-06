package book;

public class Book {
    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book(String name, Author author, double price, int qty ) {
        this.name = name;
        this.price = price;
        this.qty = 0;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=?, Author[name=?, email=?, gender=?], price=?, qty=?]";
    }
}
