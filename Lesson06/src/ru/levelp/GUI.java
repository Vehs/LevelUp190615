package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 10.07.15.
 */
abstract public class GUI {
    protected MyButton[] b;
    protected boolean isXStep = true;
    protected JLabel labelTurn;
    protected JFrame frame;
    protected GridLayout grid;
    protected JPanel mainPanel;

    public void buildGUI() {
        frame = new JFrame("TicTacToe");
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
                //newGame();
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
        mainPanel = new JPanel();
        grid = new GridLayout(3,3);
        mainPanel.setLayout(grid);
        b = new MyButton[9];
        StepListener stepListener = new StepListener(this);
        for (int i = 0; i < b.length; i++) {
            b[i] = new MyButton("");
            b[i].addActionListener(stepListener);
            mainPanel.add(b[i]);
        }

        labelTurn = new JLabel("X turn");

        frame.setJMenuBar(bar);
        frame.add(BorderLayout.NORTH, labelTurn);
        frame.add(BorderLayout.CENTER, mainPanel);
    }


    public void hasWinner() {
        //проверка победителя
        if (b[0].equals("X") && b[1].equals("X") && b[2].equals("X")) {
            //выйграл Х в первой строке
        }
    }


    public boolean isXStep() {
        return isXStep;
    }

    public void setXStep(boolean isXStep) {
        this.isXStep = isXStep;
    }

    public void changeTurnText() {
        if (isXStep) {
            labelTurn.setText("X turn");
        } else {
            labelTurn.setText("O turn");
        }
    }

    /*
    ДЗ
    1) При запуске крестиков ноликов предлагается выбрать тему (JRadioButton)
    1*) В идеальном варианте реализовать в menuBar пункт, позволяющий
        переключаться между темами прямо в игре, чтобы игровое поле
        не пропадало (игра не сбрасывается)
    2) Все окна игры (About, Winner) должны принимать текущую тему
    3) Графический интерфейс калькулятора должен быть готов
        (кнопки цифр, ',', '-/+', +-*\=, С, Backspace)
    4) Захватить текстовый редактор на занятие

     */


}
