public class TestBook {
    public static void main(String[] args) {
        Author auAuthor = new Author("Chetan Raj Beniwal", "beniwal@gmail.com", 'm');
        System.out.println(auAuthor); 

        auAuthor.setEmail("chetanraj688@gmail.com"); 
        System.out.println("Name is: " + auAuthor.getName());     
        System.out.println("Email is: " + auAuthor.getEmail());   
        System.out.println("Gender is: " + auAuthor.getGender()); 

        Book aBook = new Book("Java by Chetan", auAuthor, 999, 2);
        System.out.println(aBook);  

        aBook.setPrice(899);
        aBook.setQty(10);
        System.out.println("Name is: " + aBook.getName());
        System.out.println("Price is: " + aBook.getPrice());
        System.out.println("Qty is: " + aBook.getQty());
        System.out.println("Author is: " + aBook.getAuthor()); 
        System.out.println("Author's name is: " + aBook.getAuthorName());
        System.out.println("Author's email is: " + aBook.getAuthorEmail());
        System.out.println("Author's gender is: " + aBook.getAuthorGender());

        Book anotherBook = new Book("Advanced Java By Chetan", 
              new Author("Coder Beniwal", "Coder9beniwal@gmail.com", 'm'), 29.95);
        System.out.println(anotherBook); 

        try {
            Author invalidAuthor = new Author("Invalid", "invalid@email.com", 'x');
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

