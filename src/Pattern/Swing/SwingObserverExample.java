package Pattern.Swing;

import javax.swing.*;
import java.awt.*;


public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        Pattern.Swing.SwingObserverExample example = new Pattern.Swing.SwingObserverExample();
        example.go();

    }

    public void go() {
        frame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        jButton.addActionListener(e -> System.out.println("Come on, do it!"));
        frame.getContentPane().add(BorderLayout.CENTER, jButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, jButton);
        frame.setSize(150, 300);
        frame.setVisible(true);


    }
}

