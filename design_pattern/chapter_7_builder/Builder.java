package design_pattern.chapter_7_builder;

public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
}
