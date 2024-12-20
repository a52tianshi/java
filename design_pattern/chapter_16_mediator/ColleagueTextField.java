package design_pattern.chapter_16_mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
