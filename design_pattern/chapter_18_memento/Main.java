package design_pattern.chapter_18_memento;

import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento =  load();
        if (memento != null) {
            System.out.println("Load previous state");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("New game");
            memento = gamer.createMemento();
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("Current: " + gamer);

            gamer.bet();

            System.out.println("Money is " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Save current state");
                memento = gamer.createMemento();
                //save
                save(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Restore previous state");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }

    static void save(Memento memento) {
        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            writer.writeObject(memento);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Memento load() {
        Memento memento = null;
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento) reader.readObject();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("WS no file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
