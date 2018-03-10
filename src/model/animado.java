/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author xSyn
 */
public class animado {

    JList jList1 = new JList();
    DefaultListModel dlm = new DefaultListModel();
    String t1 = "Equipo 1: MEXICO";
    String t2 = "Equipo 2: USA";
    String t3 = "Equipo 3: RUSIA";
    String p1 = "1.-";
    int numero = 14;
    String p2 = "2.-";
    String p3 = "3.-";
    String posis = "Posiciones:";
    String gG = "";
    int num1 = 0, num2 = 0, num3 = 0;
    private JPanel panel = null;
    Graphics g2 = null;
    public Thread hilo1 = null;
    boolean running;
    public int poss1_1 = 50, poss1_2 = 1000, poss1_3 = 50, poss1_4 = 1000, poss2_1 = 50, poss2_2 = 1000, poss2_3 = 50, poss2_4 = 1000, poss3_1 = 50, poss3_2 = 1000, poss3_3 = 50, poss3_4 = 1000;
    public int x = 0, y = 0, posx = 50, posx4 = 50, posx5 = 50, pos3_1 = 50, pos3_2 = 1000, pos3_3 = 50, pos3_4 = 1000, posx6 = 1000, posx1 = 1000, posx7 = 50, posx8 = 1000, posx2 = 50, posx3 = 1000, posy = 200, img1 = 1;

    private boolean chocapuerta = false;

    public animado(JPanel j) {
        panel = j;

        jList1.setVisible(true);
        j.add(jList1, 0);

        jList1.setBounds(1000, 00, 160, 90);

        x = getPanel().getWidth() - 100;
        y = getPanel().getHeight() - 200;

    }

    public void paint(Graphics g) {

        g2 = g;
        Graphics g3 = g;
        Graphics g4 = g;
        Graphics g5 = g;

        ImageIcon back = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/basepro.jpg")).getImage());
        g.drawImage(back.getImage(), 0, 0, 1250, 870, null);

        //
        ImageIcon team1_1 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada1.gif")).getImage());
        g.drawImage(team1_1.getImage(), posx, 100, 100, 100, null);

        ImageIcon team1_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada11.gif")).getImage());
        g.drawImage(team1_2.getImage(), posx1, 100, 100, 100, null);
        ImageIcon team1_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada2.gif")).getImage());
        g.drawImage(team1_3.getImage(), posx2, 100, 100, 100, null);
        ImageIcon team1_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada21.gif")).getImage());
        g.drawImage(team1_4.getImage(), posx3, 100, 100, 100, null);
        //-----------------------------------------------------------------------------------------------------------------
        ImageIcon team2_1 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada1.gif")).getImage());
        g.drawImage(team2_1.getImage(), posx5, 300, 100, 100, null);
        ImageIcon team2_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada11.gif")).getImage());
        g.drawImage(team2_2.getImage(), posx6, 300, 100, 100, null);

        ImageIcon team2_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada2.gif")).getImage());
        g.drawImage(team2_3.getImage(), posx7, 300, 100, 100, null);
        ImageIcon team2_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada21.gif")).getImage());
        g.drawImage(team2_4.getImage(), posx8, 300, 100, 100, null);
        //---------------
        ImageIcon team3_1 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada4.gif")).getImage());
        g.drawImage(team3_1.getImage(), pos3_1, 500, 100, 100, null);
        ImageIcon team3_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada41.gif")).getImage());
        g.drawImage(team3_2.getImage(), pos3_2, 500, 100, 100, null);
        ImageIcon team3_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada1.gif")).getImage());
        g.drawImage(team3_3.getImage(), pos3_3, 500, 100, 100, null);
        ImageIcon team3_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/nada11.gif")).getImage());
        g.drawImage(team3_4.getImage(), pos3_4, 500, 100, 100, null);

            /*/XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        ImageIcon teamf1_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/gatof2.png")).getImage());
        g.drawImage(teamf1_2.getImage(), poss1_2, 100, 100, 100, null);
        ImageIcon teamf1_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/gatof3.png")).getImage());
        g.drawImage(teamf1_3.getImage(), poss1_3, 100, 100, 100, null);
        ImageIcon teamf1_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/gatof4.png")).getImage());
        g.drawImage(teamf1_4.getImage(), poss1_4, 100, 100, 100, null);
        ImageIcon teamf2_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/perrof2.png")).getImage());
        g.drawImage(teamf2_2.getImage(), poss2_2, 300, 100, 100, null);
        ImageIcon teamf2_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/perrof3.png")).getImage());
        g.drawImage(teamf2_3.getImage(), poss2_3, 300, 100, 100, null);
        ImageIcon teamf2_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/perrof4.png")).getImage());
        g.drawImage(teamf2_4.getImage(), poss2_4, 300, 100, 100, null);
        ImageIcon teamf3_2 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/dinof2.png")).getImage());
        g.drawImage(teamf3_2.getImage(), poss3_2, 500, 100, 100, null);
        ImageIcon teamf3_3 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/dinof3.png")).getImage());
        g.drawImage(teamf3_3.getImage(), poss3_3, 500, 100, 100, null);
        ImageIcon teamf3_4 = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/dinof4.png")).getImage());
        g.drawImage(teamf3_4.getImage(), poss3_4, 500, 100, 100, null);
            */

    }

    public void animacion() {

        this.panel.getGraphics().drawLine(300, 300, 450, 600);
        if (!hilo2.isAlive()) {
            hilo2.start();

        } else {
            hilo2.resume();

            chocapuerta = true;
            x = 0;
            y = 0;
            posx = 50;
            posx4 = 50;
            posx5 = 50;
            pos3_1 = 50;
            pos3_2 = 1000;
            pos3_3 = 50;
            pos3_4 = 1000;
            posx6 = 1000;
            posx1 = 1000;
            posx7 = 50;
            posx8 = 1000;
            posx2 = 50;
            posx3 = 1000;
            posy = 200;
            num1 = 0;
            num2 = 0;
            num3 = 0;
            img1 = 1;

        }
        /*       
         this.panel.getGraphics().drawLine(30, 30,45, 60);
         if(!hilo2.isAlive()){
         hilo2.start();
         }
 
         else{
         hilo2.resume();
         chocapuerta=true;
         posx=50;
         }*/

    }

    /**
     * @return the chocapuerta
     */
    public boolean isChocapuerta() {
        return chocapuerta;
    }

    /**
     * @param chocapuerta the chocapuerta to set
     */
    public void setChocapuerta(boolean chocapuerta) {
        this.chocapuerta = chocapuerta;
    }
    int t;

    public void posi(JList jList) {

    }

    public void makeData(JList jList1) {

        System.out.println("makeData()");
        if (posx > 100) {
            dlm.addElement("of course");
        }
        dlm.addElement("Holaaaaaa");
        jList1.setModel(dlm);
    }
    private Thread hilo2 = new Thread() {

        public void run() {

            try {
                while (true) {

                    /*   ImageIcon image2 =new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/noentra/"+img1+".png")).getImage());
                     panel.getGraphics().drawImage(image2.getImage(), posx, posy,400, 300,   null);     
             
                     */
                    if (num2 > num1 && num1 > num3) {

                        String temp1 = p1 + " " + t2;
                        String temp2 = p2 + " " + t1;
                        String temp3 = p3 + " " + t3;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);
                    }
                    if (num3 > num2 && num2 > num1) {
                        String temp1 = p1 + " " + t3;
                        String temp2 = p2 + " " + t2;
                        String temp3 = p3 + " " + t1;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);

                    }
                    if (num1 > num2 && num2 > num3) {
                        String temp1 = p1 + " " + t1;
                        String temp2 = p2 + " " + t2;
                        String temp3 = p3 + " " + t3;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);

                    }
                    if (num2 > num3 && num3 > num1) {
                        String temp1 = p1 + " " + t2;
                        String temp2 = p2 + " " + t3;
                        String temp3 = p3 + " " + t1;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);

                    }
                    if (num3 > num1 && num1 > num2) {
                        String temp1 = p1 + " " + t3;
                        String temp2 = p2 + " " + t1;
                        String temp3 = p3 + " " + t2;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);

                    }
                    if (num1 > num3 && num3 > num2) {
                        String temp1 = p1 + " " + t1;
                        String temp2 = p2 + " " + t3;
                        String temp3 = p3 + " " + t2;
                        dlm.addElement(posis);
                        dlm.addElement(temp1);
                        dlm.addElement(temp2);
                        dlm.addElement(temp3);
                        jList1.setModel(dlm);

                    }

                    jList1.setModel(dlm);

                    img1++;
                    if (img1 == 8) {
                        img1 = 1;
                    }
                    /* if (posx == 850) {
                     hilo2.suspend();

                     }*/
                    Random ran = new Random();
                    if (posx5 < 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx5 += suma;
                        num2 = num2 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((posx5 > 1000 || posx5 == 1000) && posx6 > 50) {
                        posx5 = 1000;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx6 -= suma;
                        num2 = num2 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((posx6 < 50 || posx6 == 50) && posx7 < 1000) {

                        posx6 = 50;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx7 += suma;
                        num2 = num2 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if (posx7 > 1000 || posx7 == 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx8 -= suma;
                        num2 = num2 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                        posx7 = 1000;

                    }
                    if (posx8 < 50 || posx8 == 50) {
                        posx8 = 50;
                        System.out.print("Termino Team 2------------");

                    }

                    //
                    if (posx < 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx += suma;
                        num1 = num1 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((posx > 1000 || posx == 1000) && posx1 > 50) {
                        posx = 1000;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx1 -= suma;
                        num1 = num1 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((posx1 < 50 || posx1 == 50) && posx2 < 1000) {

                        posx1 = 50;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx2 += suma;
                        num1 = num1 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if (posx2 > 1000 || posx2 == 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        posx3 -= suma;
                        num1 = num1 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                        posx2 = 1000;

                    }
                    if (posx3 < 50 || posx3 == 50) {
                        posx3 = 50;

                        System.out.print("Termino Team 1------------");

                    }

                    //team 3
                    if (pos3_1 < 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        pos3_1 += suma;
                        num3 = num3 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((pos3_1 > 1000 || pos3_1 == 1000) && pos3_2 > 50) {
                        pos3_1 = 1000;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        pos3_2 -= suma;
                        num3 = num3 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if ((pos3_2 < 50 || pos3_2 == 50) && pos3_3 < 1000) {

                        pos3_2 = 50;
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        pos3_3 += suma;
                        num3 = num3 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                    }
                    if (pos3_3 > 1000 || pos3_3 == 1000) {
                        int suma = (int) (ran.nextDouble() * 60 + 0);
                        pos3_4 -= suma;
                        num3 = num3 + suma;
                        System.out.print(num1 + " - " + num2 + "\n");
                        pos3_3 = 1000;

                    }
                    if (pos3_4 < 50 || pos3_4 == 50) {
                        pos3_4 = 50;
                        System.out.print("Termino Team 3-------------");

                    }

                    panel.repaint();
                    if (posx8 == 50 && pos3_4 == 50 && posx3 == 50) {
                        Object g1 = dlm.getElementAt(1);
                        Object g2 = dlm.getElementAt(2);
                        Object g3 = dlm.getElementAt(3);
                        String ana1 = (String) g1;
                        String ana2 = (String) g2;
                        String ana3 = (String) g3;

                        if (ana1.startsWith("MEXICO", numero) == true && ana2.startsWith("USA", numero) == true) {

                            gG = "Ganador: MEXICO!!\n" + "Segundo: USA!!\n" + "Tercero: RUSIA D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }
                        if (ana1.startsWith("USA", numero) == true && ana2.startsWith("MEXICO", numero) == true) {

                            gG = "Ganador: USA!!\n" + "Segundo: MEXICO!!!\n" + "Tercero: RUSIA D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }
                        if (ana1.startsWith("USA", numero) == true && ana2.startsWith("RUSIA", numero) == true) {

                            gG = "Ganador: USA!!\n" + "Segundo: RUSIA!!!\n" + "Tercero: MEXICO D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }
                        if (ana1.startsWith("RUSIA", numero) == true && ana2.startsWith("MEXICO", numero) == true) {

                            gG = "Ganador: RUSIA! FTW!!\n" + "Segundo: MEXICO!!!\n" + "Tercero: USA D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }
                        if (ana1.startsWith("RUSIA", numero) == true && ana2.startsWith("USA", numero) == true) {

                            gG = "Ganador: RUSIA! FTW!!\n" + "Segundo: USA!!!\n" + "Tercero: MEXICO! D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }
                        if (ana1.startsWith("MEXICO", numero) == true && ana2.startsWith("RUSIA", numero) == true) {

                            gG = "Ganador: MEXICO!!\n" + "Segundo: RUSIA!!\n" + "Tercero: USA D; \n";
                            JOptionPane.showMessageDialog(null, gG, "Fin de la carrera", 1);
                        }

                        hilo2.suspend();

                    }

                    hilo2.sleep(200);
                    dlm.clear();
                    jList1.setModel(dlm);

                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the hilo2
     */
    public Thread getHilo2() {
        return hilo2;
    }

    /**
     * @param hilo2 the hilo2 to set
     */
    public void setHilo2(Thread hilo2) {
        this.hilo2 = hilo2;
    }

    public void setHilo3(Thread hilo3) {
        this.hilo2 = hilo3;
    }

    public void setHilo4(Thread hilo4) {
        this.hilo2 = hilo4;
    }
}
