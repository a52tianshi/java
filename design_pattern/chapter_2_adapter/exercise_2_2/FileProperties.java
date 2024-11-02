package design_pattern.chapter_2_adapter.exercise_2_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    public void readFromFile(String filename) throws IOException {
        System.out.println("readFromFile: " + filename);
        String dirPath = FileProperties.class.getResource("").getPath();
        FileInputStream fis = new FileInputStream(dirPath+filename);
        properties = new Properties();
        properties.load(fis);
    }

    public void writeToFile(String filename) throws IOException {
        System.out.println("writeToFile: " + filename);
        String dirPath = FileProperties.class.getResource("").getPath();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(dirPath + filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        properties.store(fos, "written by FileProperties");
        fos.close();
        System.out.println("write ok");
    }

    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
