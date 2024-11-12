package design_pattern.chapter_12_decorator;

public class MultiStringDisplay extends Display {
    private String[] strings;

    public MultiStringDisplay() {
        this.strings = new String[0];
    }

    public void add(String string) {
        String[] newStrings = new String[strings.length + 1];
        System.arraycopy(strings, 0, newStrings, 0, strings.length);
        newStrings[strings.length] = string;
        strings = newStrings;
    }

    public int getColumns() {
        int max = 0;
        for (String string : strings) {
            if (string.getBytes().length > max) {
                max = string.getBytes().length;
            }
        }
        return max;
    }

    public int getRows() {
        return strings.length;
    }

    public String getRowText(int row) {
        return strings[row];
    }
}
