package design_pattern.chapter_1_interator;

public class BookShelfIteratorV2 implements Iterator {
    private final BookShelfV2 bookShelf;
    private int index;

    public BookShelfIteratorV2(BookShelfV2 bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    //指向这个元素 然后index++,  可以想想假设初始化 iterator的时候 index = 0, 直接调用next()的时候, 应该返回第一个元素
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
