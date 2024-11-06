package design_pattern.chapter_7_builder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameBuilder implements Builder {
    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);

    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    public void makeString(String str) {
        box.add(new JLabel(str));
    }

    public void makeItems(String[] items) {
        Box innerbox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < items.length; i++) {
            JButton button = new JButton(items[i]);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.getActionCommand());
                }
            });
            innerbox.add(button);
        }
        box.add(innerbox);
    }

    public JFrame getResult() {
        return frame;
    }

    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
