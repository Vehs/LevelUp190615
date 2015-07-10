package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
public class GUI {
    private MyButton[] b;
    private boolean isXStep = true;

    public void buildGUI() {
        JFrame frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,300,300);

        //JMenuBar - объект этого класса - панель меню
        //JMenu - меню на панели (File, View, Edit)
        //JMenuItem - пункт в меню (File->New Game)
        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        JMenuItem newGameMenuItem = new JMenuItem("New Game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");

        //Добавить меню About, при клике на которое появляется
        //окошко с email автора и кнопкой Ok, которая закрывает это окошко

        /*Анонимные классы:
        Создается класс с неизвестным именем, который реализует интерфейс
        ActionListener. Затем создается объект этого класса и передается
        в скобочки метода addActionListener.
         */
        aboutMenuItem.addActionListener(new AboutListener());

        newGameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < b.length; i++) {
                    b[i].setText("");
                    b[i].setEnabled(true);
                }
                isXStep = true;
            }
        });

        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newGameMenuItem);
        fileMenu.add(aboutMenuItem);
        fileMenu.add(quitMenuItem);
        bar.add(fileMenu);

        //Создание кнопок
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,3));
        b = new MyButton[9];
        StepListener stepListener = new StepListener();
        for (int i = 0; i < b.length; i++) {
            b[i] = new MyButton("");
            b[i].addActionListener(stepListener);
            mainPanel.add(b[i]);
        }

        frame.setJMenuBar(bar);
        frame.add(BorderLayout.CENTER, mainPanel);
        frame.setVisible(true);
    }

    /*
    1) Добить StepListener
    2) В классе GUI добавить метод проверки победителя
    3) При победе выскакивает окно с надписью "X WON" или "O WON"
        и кнопкой Оk, при нажатии которой окошко закрывается
        и начинается новая игра
    4) Сверху, над игровым полем, добавить надпись чей следующий ход
        ("X turn"/"O turn")
     */
}
