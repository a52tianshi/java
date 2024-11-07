package design_pattern.chapter_8_abstract_factory.factory;
import java.util.ArrayList;
public abstract class Tray extends Item {
    //为什么这里要用protected修饰符？
    //因为这里的tray是一个ArrayList，我们希望这个ArrayList可以被子类访问到，但是不希望被其他类访问到
    //要是用private修饰符的话，子类就无法访问到这个ArrayList了
    //好处是，我们可以在子类中对这个ArrayList进行操作，但是其他类无法对这个ArrayList进行操作
    //如果是private修饰符的话，子类就无法对这个ArrayList进行操作了
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
