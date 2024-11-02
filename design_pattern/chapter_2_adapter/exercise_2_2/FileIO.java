package design_pattern.chapter_2_adapter.exercise_2_2;

import java.io.*;

public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String Value);
    public String getValue(String key);
}