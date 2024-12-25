public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("Chetan Raj Beniwal", "beniwal@gmail.com", 'm');
        System.out.println(author1);

        // try {
        //     new Author("Invalid", "invalid@email.com", 'x');
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught exception: " + e.getMessage());
        // }

        Author[] authors = new Author[2];
        authors[0] = new Author("Pawan", "pawan@gmail.com", 'm');
        authors[1] = new Author("Anand", "anand@gmail.com", 'm');
             

        Book a = new Book("Java By Chetan", authors, 999, 5);
        System.out.println(a);

        System.out.println("Author names: " + a.getAuthorNames());

        a.setPrice(890);
        a.setQty(12);
        System.out.println("Updated book: " + a);

        Book pythonBook = new Book("Python Basics By Chetan Beniwal", 
            new Author[]{new Author("Beniwal", "chetanraj688@gmail.com", 'm')}, 
            200.5, 30);
        System.out.println(pythonBook);
    }
}

