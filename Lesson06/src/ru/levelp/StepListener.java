package ru.levelp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
public class StepListener implements ActionListener {

    private GUI view;

    public StepListener(GUI view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();
        if (b.getText().equals("")) {
            if (view.isXStep()) {
                b.setText("X");
                view.setXStep(false);
            } else {
                b.setText("O");
                view.setXStep(true);
            }
            view.changeTurnText();
            view.hasWinner();
            //b[k].setEnabled(false);
        }
    }
}
