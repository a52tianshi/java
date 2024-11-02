package design_pattern.chapter_2_adapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        PrintV2 p2 = new PrintBannerV2("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}
