package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 07.07.15.
 */
public class GUI {
    //private JButton button;
    private int count = 0;

    public void buildGUI() {
        JFrame mainFrame = new JFrame("First GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(200, 200, 400, 300);

//        button = new JButton("Push me!");
//
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                button.setText(String.valueOf(++count)); //Integer.toString(count);
//            }
//        });

        //JFrame - диспетчер компоновки BorderLayout
        //mainFrame.add(button);
        //JPanel - дисп. комп. FlowLayout
        JLabel label = new JLabel("Input text:");

        //JTextField - текстовое поле для одной строки
        JTextArea textArea = new JTextArea();

        JPanel mainPanel = new JPanel();

        JButton incButton = new JButton("+");
        incButton.setForeground(Color.RED);
        JButton decButton = new JButton("-");
        JButton clearButton = new JButton("Clear");
        JButton quitButton = new JButton("Quit");

        mainPanel.add(incButton);
        mainPanel.add(decButton);
        mainPanel.add(clearButton);
        mainPanel.add(quitButton);

//        JButton northButton = new JButton("NORTH");
//        JButton southButton = new JButton("SOUTH");
//        JButton westButton = new JButton("WEST");
//        JButton eastButton = new JButton("EAST");
//        JButton centerButton = new JButton("CENTER");
//
//        mainPanel.add(northButton);
//        mainPanel.add(southButton);
//        mainPanel.add(westButton);
//        mainPanel.add(eastButton);
//        mainPanel.add(centerButton);

        mainFrame.add(BorderLayout.NORTH, label);
        mainFrame.add(BorderLayout.CENTER, textArea);
        mainFrame.add(BorderLayout.SOUTH, mainPanel);
//
//        mainFrame.add(BorderLayout.NORTH, northButton);
//        mainFrame.add(BorderLayout.SOUTH, southButton);
//        mainFrame.add(BorderLayout.WEST, westButton);
//        mainFrame.add(BorderLayout.EAST, eastButton);
//        mainFrame.add(BorderLayout.CENTER, centerButton);

        mainFrame.setVisible(true);
    }

    /*
    1) Диспетчеры компоновки
    2) Реализовать обработчики событий для текстового редактора
    3) Собрать интерфейс для игры "крестики-нолики"
    4) Читать способы создания обработчиков событий
    5*) Собрать интерфейс калькулятора
     */
}
