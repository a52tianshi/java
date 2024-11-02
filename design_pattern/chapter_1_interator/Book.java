package design_pattern.chapter_1_interator;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //cq added
    protected void SetName(String name) {
        this.name = name;
    }
}
