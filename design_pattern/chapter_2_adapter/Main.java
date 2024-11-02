package design_pattern.chapter_2_adapter;

public class Main {
    public static void main(String[] args) {
        //为什么要用Print 而不是直接用PrintBanner呢？
        // 因为PrintBanner是一个具体的类，如果直接用PrintBanner，那么如果以后要换成其他的类，就需要修改代码
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        PrintV2 p2 = new PrintBannerV2("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}
