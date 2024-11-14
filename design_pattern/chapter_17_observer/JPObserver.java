package design_pattern.chapter_17_observer;

public class JPObserver implements Observer {
    public void update(NumberGenerator generator) {
        //打印
        //姜萍说 主=generator.getNumber()
        System.out.println("姜萍说 主="+generator.getNumber());
    }
}
