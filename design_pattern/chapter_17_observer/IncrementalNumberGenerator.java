package design_pattern.chapter_17_observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;//not include
    private int step;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = start; i < end; i += step) {
            number = i;
            notifyObservers();
        }
    }
}
