package design_pattern.chapter_17_observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private int number;
    private Random random = new Random();
    public int getNumber() {
        return number;
    }
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
