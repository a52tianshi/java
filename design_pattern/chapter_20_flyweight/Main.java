package design_pattern.chapter_20_flyweight;

public class Main {
    public static void main(String[] args) {
        BigString bs = new BigString("121212301212123012121230121" +
                "212301212123012121230121212301212123012121230121212301212123012121230",false);
        bs.print();

        //memory efficient
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory Used: " + used);
    }
}
