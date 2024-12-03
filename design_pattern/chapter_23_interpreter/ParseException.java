package design_pattern.chapter_23_interpreter;

public class ParseException extends RuntimeException {
    public ParseException(String message) {
        super(message);
    }
}
