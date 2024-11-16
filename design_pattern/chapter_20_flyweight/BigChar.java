package design_pattern.chapter_20_flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            String FileName = "design_pattern/chapter_20_flyweight/big" + charname + ".txt";
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            fontdata = buf.toString();
        } catch (IOException e) {
            fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
