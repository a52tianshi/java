package design_pattern.chapter_8_abstract_factory.list_factory;

import design_pattern.chapter_8_abstract_factory.factory.Factory;
import design_pattern.chapter_8_abstract_factory.factory.Link;
import design_pattern.chapter_8_abstract_factory.factory.Tray;
import design_pattern.chapter_8_abstract_factory.factory.Page;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
