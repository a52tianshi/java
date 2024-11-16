package design_pattern.chapter_19_state;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return singleton;
    }

    public void doClock(Context context, int hour) {
        if (hour == 12) {
            context.changeState(LunchState.getInstance());
        } else if (8 <= hour && hour < 21) {
            context.changeState(DayState.getInstance());
        }
    }

    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    public String toString() {
        return "晚上";
    }
}
