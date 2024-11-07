package design_pattern.chapter_8_abstract_factory.list_factory;

import design_pattern.chapter_8_abstract_factory.factory.Link;
public class ListLink extends Link{
    //为什么要定义一个ListLink 这个方法呢
    //因为我们需要实现Link这个抽象类，所以我们需要定义一个具体的类来实现这个抽象类
    //而且java无法继承 构造函数，所以我们需要在这里定义一个构造函数
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
