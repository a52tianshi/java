package design_pattern.chapter_21_proxy;

public interface Printable {
    public String getPrinterName();

    public void setPrinterName(String name);

    public void print(String string);
}
