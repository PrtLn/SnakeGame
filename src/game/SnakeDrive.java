package game;

import javax.swing.*;
import java.awt.*;

public class SnakeDrive extends JFrame {

    public SnakeDrive() {
        initUI();
    }

    private void initUI() {
        add(new Surface());

        setTitle("Snake");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SnakeDrive shakeFrame = new SnakeDrive();
                shakeFrame.setVisible(true);
            }
        });
    }
}
