package design_pattern.chapter_21_proxy;

public class PrinterProxy implements Printable {
    private String name;
    private Printable real;
    private String className;

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getPrinterName() {
        return name;
    }

    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (ClassNotFoundException e) {
                System.err.println("找不到类" + className + "。");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
