package design_pattern.chapter_5_singleton.exercise_5_1;

public class TickerMaker {
    private int ticket = 1000;
    private static TickerMaker singleton = new TickerMaker();
    private TickerMaker() {
        System.out.println("生成了一个实例");
    }
    public static TickerMaker getInstance() {
        return singleton;
    }
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
