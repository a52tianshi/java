package design_pattern.chapter_19_state;

public class LunchState implements State{
    private static LunchState singleton = new LunchState();

    private LunchState() {
    }

    public static LunchState getInstance() {
        return singleton;
    }

    public void doClock(Context context, int hour) {
        if (hour < 8 || 21 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (hour != 12) {
            context.changeState(DayState.getInstance());
        }
    }

    public void doUse(Context context) {
        context.callSecurityCenter("紧急：午餐时间使用金库！");
    }

    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（午餐时间）");
    }

    public void doPhone(Context context) {
        context.recordLog("午餐时间的通话录音");
    }

    public String toString() {
        return "午餐时间";
    }
}
