package design_pattern.chapter_8_abstract_factory.list_factory;

import design_pattern.chapter_8_abstract_factory.factory.Link;
public class ListLink extends Link{
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
