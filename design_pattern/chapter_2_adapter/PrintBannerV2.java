package design_pattern.chapter_2_adapter;

public class PrintBannerV2 extends PrintV2 {
    private Banner banner;

    public PrintBannerV2(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
