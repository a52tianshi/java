package design_pattern.chapter_22_command;

import java.awt.Color;

public interface Drawable {
    public abstract void init();
    public abstract void draw(int x, int y);
    public abstract void setColor(Color color);
}
