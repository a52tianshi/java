package design_pattern.chapter_7_builder;

public class TextBuilder implements Builder{
    //为什么这里要用StringBuffer而不是StringBuilder？
    //因为StringBuffer是线程安全的，而StringBuilder是非线程安全的。
    //为什么不用String?
    //因为String是不可变的，每次对String进行操作都会生成一个新的String对象，这样会导致内存的浪费。
    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("　・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
