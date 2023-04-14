package book;

public class BookTest {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.94, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    }
}

/*
Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m]
Book[name=Java for dummy,Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m],price=19.95,qty=99]
name is: Java for dummy
price is: 29.95
qty is: 28
Author is: Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m]
Author's name is: Tan Ah Teck
Author's email is: ahteck@nowhere.com
Book[name=more Java,Author[name=Paul Tan,email=paul@somewhere.com,gender=m],price=29.95,qty=0]
 */