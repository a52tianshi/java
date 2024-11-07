package design_pattern.chapter_9_bridge;



public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay((int) (Math.random() * times));
    }
}
