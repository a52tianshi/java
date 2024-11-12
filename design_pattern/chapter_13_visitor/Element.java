package design_pattern.chapter_13_visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
