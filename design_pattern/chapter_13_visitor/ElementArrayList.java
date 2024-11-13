package design_pattern.chapter_13_visitor;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList implements Element {
    public void accept(Visitor v) {
        for (int i = 0; i < size(); i++) {
            Element element = (Element)get(i);
            element.accept(v);
        }
    }
}
