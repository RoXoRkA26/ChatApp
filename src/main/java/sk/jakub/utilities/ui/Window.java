package sk.jakub.utilities.ui;

import sk.jakub.utilities.ui.center.DialogWindow;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private DialogWindow dw;

    public Window() {
        super("ChatApp [Beta]");
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(500, 700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initUI();

        pack();
        setVisible(true);
    }

    private void initUI() {
        dw = new DialogWindow();
        getContentPane().add(dw);
    }
}
