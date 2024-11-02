package design_pattern.chapter_1_interator;

import java.util.ArrayList;

public class BookShelfV2 implements Aggregate {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelfV2(int maxsize) {
        this.books = new ArrayList<Book>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIteratorV2(this);
    }
}
