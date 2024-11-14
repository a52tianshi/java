package design_pattern.chapter_17_observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new JPObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();

        //17-1
        IncrementalNumberGenerator generator2 = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer4 = new JPObserver();
        generator2.addObserver(observer4);
        generator2.execute();
    }
}
