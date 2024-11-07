package design_pattern.chapter_8_abstract_factory;
import design_pattern.chapter_8_abstract_factory.factory.*;
public class Main {
    public static void main(String[] args) {
        //exercise 8.2
        if (args.length == 0) {
            Factory listFactory = Factory.getFactory("design_pattern.chapter_8_abstract_factory.list_factory.ListFactory");
            Page listPage = listFactory.createYahooPage();
            listPage.output();
            return;
        }

        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main design_pattern.chapter_8_abstract_factory.listfactory.ListFactory");
            System.out.println("Example 2: java Main design_pattern.chapter_8_abstract_factory.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link People = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link GMW = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link USYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link JPYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link Excite = factory.createLink("Excite", "http://www.excite.com/");
        Link Google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(People);
        traynews.add(GMW);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(USYahoo);
        trayyahoo.add(JPYahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(Excite);
        traysearch.add(Google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
