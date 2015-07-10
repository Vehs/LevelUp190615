package ru.levelp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
public class AboutListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new AboutGUI().open();
    }
}
