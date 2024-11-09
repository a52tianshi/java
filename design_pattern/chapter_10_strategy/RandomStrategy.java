package design_pattern.chapter_10_strategy;

public class RandomStrategy implements Strategy {
    public Hand nextHand() {
        return Hand.getHand((int) (Math.random() * 3));
    }

    public void study(boolean win) {
    }
}
