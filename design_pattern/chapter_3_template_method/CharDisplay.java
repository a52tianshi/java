package design_pattern.chapter_3_template_method;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    protected void open() {
        System.out.print("<<");
    }
    public void print() {
        System.out.print(ch);
    }
    public void close() {
        System.out.println(">>");
    }
}
