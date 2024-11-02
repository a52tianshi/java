package design_pattern.chapter_1_interator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        try {
            bookShelf.appendBook(new Book("Not OK"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException ok");
        }
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }


        BookShelfV2 bookShelfV2 = new BookShelfV2(4);
        bookShelfV2.appendBook(new Book("Around the World in 80 Days"));
        bookShelfV2.appendBook(new Book("Bible"));
        bookShelfV2.appendBook(new Book("Cinderella"));
        bookShelfV2.appendBook(new Book("Daddy-Long-Legs"));
        bookShelfV2.appendBook(new Book("OK"));
        Iterator itV2 = bookShelfV2.iterator();
        while (itV2.hasNext()) {
            Book book = (Book) itV2.next();
            System.out.println(book.getName());
        }
    }
}
