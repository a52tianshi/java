package design_pattern.chapter_7_builder;

public class HTMLBuilder implements Builder {
    private String filename;
    private java.io.PrintWriter writer;

    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new java.io.PrintWriter(new java.io.FileWriter(filename));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
