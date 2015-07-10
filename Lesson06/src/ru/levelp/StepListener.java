package ru.levelp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
public class StepListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();
        if (b.getText().equals("")) {
            if (isXStep) {
                b.setText("X");
                isXStep = false;
            } else {
                b.setText("O");
                isXStep = true;
            }
            //b[k].setEnabled(false);
        }
    }
}
