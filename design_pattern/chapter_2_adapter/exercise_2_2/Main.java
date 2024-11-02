package design_pattern.chapter_2_adapter.exercise_2_2;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        System.out.println(Main.class.getResource(""));
        try {
            f.readFromFile("file.txt");
            //f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
