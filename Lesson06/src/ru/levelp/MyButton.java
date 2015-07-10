package ru.levelp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vladimir on 10.07.15.
 */
public class MyButton extends JButton {

    public MyButton(String title) {
        super(title); //new JButton("")
        setFont(new Font("Arial", Font.BOLD, 30));
        setForeground(Color.BLUE);
    }
}
