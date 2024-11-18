package design_pattern.chapter_22_command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack commands = new Stack();

    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
