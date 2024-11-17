package design_pattern.chapter_21_proxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "design_pattern.chapter_21_proxy.Printer");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");

        Printable p2 = new PrinterProxy("Alice", "design_pattern.chapter_21_proxy.PrinterWrong");
        p2.print("Hello, world.");
    }
}
