package book1;

public class Book1Test {
    public static void main(String[] args) {
        // Test Author class
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // Test Book class
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getName());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
}

/*
Author[name=Tan Ah Teck,email=ahteck@nowhere.com]
Author[name=Tan Ah Teck,email=ahteck@somewhere.com]
name is: Tan Ah Teck
email is: ahteck@somewhere.com
Book[isbn=12345,name=Java for dummies,Author[name=Tan Ah Teck,email=ahteck@somewhere.com],price=8.8,qty=88]
Book[isbn=12345,name=Java for dummies,Author[name=Tan Ah Teck,email=ahteck@somewhere.com],price=9.9,qty=99]
isbn is: Java for dummies
name is: Java for dummies
price is: 9.9
qty is: 99
author is: Author[name=Tan Ah Teck,email=ahteck@somewhere.com]
author's name: Tan Ah Teck
author's name: Tan Ah Teck
author's email: ahteck@somewhere.com
 */