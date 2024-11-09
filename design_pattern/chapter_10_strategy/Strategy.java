package design_pattern.chapter_10_strategy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
