package ru.levelp;

import java.awt.*;

/**
 * Created by vladimir on 14.07.15.
 */
public class ChildGUI extends GUI {

    @Override
    public void buildGUI() {
        super.buildGUI();
        frame.setBounds(100, 100, 500, 500);
        grid.setHgap(10);
        mainPanel.setBackground(Color.cyan);
        frame.setVisible(true);
    }
}
