package design_pattern.chapter_3_template_method;

public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();
    //只有抽象类才能定义抽象方法, 接口不能定义抽象方法
    protected final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
