package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Surface extends JPanel implements ActionListener {

    public Surface() {
        initSurface();
    }
    private void initSurface() {
        setBackground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
