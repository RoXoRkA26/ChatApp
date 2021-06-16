package sk.jakub.utilities.ui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        super("ChatApp [Beta]");
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(500, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pack();
        setVisible(true);
    }
}
