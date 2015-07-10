package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
public class AboutGUI {

    public void open() {
        JFrame frame = new JFrame("About");
        frame.setBounds(100,100,200,100);

        JLabel email = new JLabel("parfenov.vladimir.s@gmail.com");

        JButton okButton = new JButton("ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(BorderLayout.CENTER, email);
        frame.add(BorderLayout.SOUTH, okButton);

        frame.setVisible(true);
    }
}
