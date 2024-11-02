package design_pattern.chapter_5_singleton.exercise_5_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TickerMaker obj1 = TickerMaker.getInstance();
        TickerMaker obj2 = TickerMaker.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1和obj2是相同的实例");
        } else {
            System.out.println("obj1和obj2是不同的实例");
        }
        System.out.println("End.");

        for (int i = 0; i < 10; i++) {
            System.out.println(TickerMaker.getInstance().getNextTicketNumber());
        }
    }
}
