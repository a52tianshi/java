package design_pattern.chapter_22_command;

import java.awt.Point;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.position = point;
    }

    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
