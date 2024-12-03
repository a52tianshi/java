package design_pattern.chapter_23_interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
