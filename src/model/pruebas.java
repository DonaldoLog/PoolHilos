/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Frame;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author xSYN
 */
public class pruebas extends JFrame {

    DefaultListModel model;
    JList jList;
    JScrollPane jScrollPane;

    Thread thread;

    public pruebas() {
        this.setTitle("ASM_SIMULATOR");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        model = new DefaultListModel();
        jList = new JList(model);
        jScrollPane = new JScrollPane(jList);

        jList.setBounds(50, 50, 300, 200);
        jScrollPane.setBounds(50, 50, 300, 200);

        this.getContentPane().add(jScrollPane);

        this.setVisible(true);

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                    makeData();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        thread.start();
    }

    public void makeData() {
        System.out.println("makeData()");
        model.clear();

        for (int i = 0; i < 20; i++) {
            model.addElement((int) (Math.random() * 100));
        }

    }

    public static void main(String[] args) {
        new pruebas();
    }
}
