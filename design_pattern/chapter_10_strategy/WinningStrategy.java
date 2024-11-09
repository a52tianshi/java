package design_pattern.chapter_10_strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        prevHand = Hand.getHand(new Random(seed).nextInt(3));
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(new Random().nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
