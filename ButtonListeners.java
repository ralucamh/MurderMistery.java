import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonListeners implements ActionListener {

    JButton buttonM;
    JButton buttonV; 
    JButton buttonG;
    JButton buttonR;
    JButton buttonC;
    JButton buttonE;

    JButton weaponA;
    JButton weaponB;
    JButton weaponC;
    JButton weaponD;
    JButton weaponE;
    JButton weaponF;

    JFrame suspect;
    JFrame weapon;
    JFrame room;

    String[] assumption = {"", "", ""};
    
    public ButtonListeners() {

        suspect = new JFrame("Make an assumption." + '\n' + "Choose a suspect");
        weapon = new JFrame("Make an assumption." + '\n' + "Choose a weapon");
        room = new JFrame("Make an assumption." + '\n' + "Choose a room");

        buttonM = new JButton();
        buttonM.setBounds(150, 10, 200, 40);
        suspect.add(buttonM);
        buttonM.addActionListener(this); 

        buttonV = new JButton();
        buttonV.setBounds(150, 10, 200, 40); 
        suspect.add(buttonV);
        buttonV.addActionListener(this); 

        buttonG = new JButton();
        buttonG.setBounds(150, 10, 200, 40);
        suspect.add(buttonM);
        buttonG.addActionListener(this); 

        buttonR = new JButton();
        buttonR.setBounds(150, 10, 200, 40);
        suspect.add(buttonR);
        buttonR.addActionListener(this); 

        buttonC = new JButton();
        buttonC.setBounds(150, 10, 200, 40);
        suspect.add(buttonC);
        buttonC.addActionListener(this); 

        buttonE = new JButton();
        buttonE.setBounds(150, 10, 200, 40);
        suspect.add(buttonE);
        buttonE.addActionListener(this); 

        weaponA = new JButton();
        weaponA.setBounds(100, 10, 200, 40);
        weapon.add(weaponA);
        weaponA.addActionListener(this);

        weaponB = new JButton();
        weaponB.setBounds(100, 10, 200, 40);
        weapon.add(weaponB);
        weaponB.addActionListener(this);

        weaponC = new JButton();
        weaponC.setBounds(100, 10, 200, 40);
        weapon.add(weaponC);
        weaponC.addActionListener(this);

        weaponD = new JButton();
        weaponD.setBounds(100, 10, 200, 40);
        weapon.add(weaponD);
        weaponD.addActionListener(this);

        weaponE = new JButton();
        weaponE.setBounds(100, 10, 200, 40);
        weapon.add(weaponE);
        weaponE.addActionListener(this);

        weaponF = new JButton();
        weaponF.setBounds(100, 10, 200, 40);
        weapon.add(weaponF);
        weaponF.addActionListener(this);

    }

    public static void main(String args[]) {
      //  ButtonListeners btnevents = new ButtonListeners();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonM) {
            assumption[0] = "Marcel";
        }
        if (e.getSource() == buttonV) {
            assumption[0] = "Vasilica";
        }
        if (e.getSource() == buttonG) {
            assumption[0] = "Gigela";
        }
        if (e.getSource() == buttonR) {
            assumption[0] = "Relu";
        }
        if (e.getSource() == buttonC) {
            assumption[0] = "Costel";
        }
        if (e.getSource() == buttonE) {
            assumption[0] = "Eusebiu";
        }
              
        suspect.setVisible(false);
        weapon.setVisible(true);
            
        

    }
    
}