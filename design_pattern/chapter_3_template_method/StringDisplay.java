package design_pattern.chapter_3_template_method;

import java.lang.String;

public class StringDisplay extends AbstractDisplay {
    private final String str;
    private final int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    public void open() {
        printLine();
    }
    public void print() {
        System.out.println("|" + str + "|");
    }
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
