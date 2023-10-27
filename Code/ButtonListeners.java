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

    JButton weaponS;
    JButton weaponG;
    JButton weaponR;
    JButton weaponP;
    JButton weaponC;
    JButton weaponB;


    JButton kitchen;
    JButton lounge;
    JButton billiardRoom;
    JButton study;
    JButton hall;
    JButton library;
    JButton conservatory;


    void visible(JFrame x, JFrame y) {
        x.setVisible(false);
        y.setVisible(true);
    }

    ImageIcon v = new ImageIcon("Vasilica.jpg");
    ImageIcon e = new ImageIcon("Eusebiu.jpg");
    ImageIcon m = new ImageIcon("Marcela.jpg");
    ImageIcon g = new ImageIcon("Gigela.jpg");
    ImageIcon r = new ImageIcon("Relu.jpg");
    ImageIcon c = new ImageIcon("Costel.jpg");
    ImageIcon broom = new ImageIcon("Broom.jpg");
    ImageIcon crossbow = new ImageIcon("Crossbow.jpg");
    ImageIcon gun = new ImageIcon("Gun.jpg");
    ImageIcon poison = new ImageIcon("Poison.jpg");
    ImageIcon spoon = new ImageIcon("Spoon.jpg");
    ImageIcon rope = new ImageIcon("Rope.jpg");
    
    String[] assumption = {"", "", ""};
    
    public ButtonListeners() {

        Global.suspect.setSize(700, 700);
        Global.suspect.setLocationRelativeTo(null);
        Global.suspect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Global.suspect.setLayout(null); 

        Global.weapon.setSize(700, 700);
        Global.weapon.setLocationRelativeTo(null);
        Global.weapon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Global.weapon.setLayout(null); 

        Global.room.setSize(700, 700);
        Global.room.setLocationRelativeTo(null);
        Global.room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Global.room.setLayout(null); 
          
        buttonM = new JButton(m);
        buttonM.setBounds(30, 25, 200, 300);
        Global.suspect.add(buttonM);
        buttonM.addActionListener(this); 
        
        buttonC = new JButton(c);
        buttonC.setBounds(240, 25, 200, 300);
        Global.suspect.add(buttonC);
        buttonC.addActionListener(this); 
         
        buttonG = new JButton(g);
        buttonG.setBounds(240, 335, 200, 300);
        Global.suspect.add(buttonG);
        buttonG.addActionListener(this); 
        
        buttonR = new JButton(r);
        buttonR.setBounds(30, 335, 200, 300);
        Global.suspect.add(buttonR);
        buttonR.addActionListener(this); 

        buttonV = new JButton(v);
        buttonV.setBounds(450, 25, 200, 300); 
        Global.suspect.add(buttonV);
        buttonV.addActionListener(this);

        buttonE = new JButton(e);
        buttonE.setBounds(450, 335, 200, 300);
        Global.suspect.add(buttonE);
        buttonE.addActionListener(this); 
        
        weaponS = new JButton(spoon);
        weaponS.setBounds(30, 25, 200, 280);
        Global.weapon.add(weaponS);
        weaponS.addActionListener(this);

        weaponG = new JButton(gun);
        weaponG.setBounds(240, 25, 200, 280);
        Global.weapon.add(weaponG);
        weaponG.addActionListener(this);

        weaponR = new JButton(rope);
        weaponR.setBounds(450, 25, 200, 280);
        Global.weapon.add(weaponR);
        weaponR.addActionListener(this);

        weaponP = new JButton(poison);
        weaponP.setBounds(30, 335, 200, 280);
        Global.weapon.add(weaponP);
        weaponP.addActionListener(this);

        weaponC = new JButton(crossbow);
        weaponC.setBounds(240, 335, 200, 280);
        Global.weapon.add(weaponC);
        weaponC.addActionListener(this);

        weaponB = new JButton(broom);
        weaponB.setBounds(450, 335, 200, 280);
        Global.weapon.add(weaponB);
        weaponB.addActionListener(this);

        kitchen = new JButton();
        kitchen.setBounds(450, 335, 200, 300);
        Global.room.add(kitchen);
        kitchen.addActionListener(this);

        lounge = new JButton();
        lounge.setBounds(450, 335, 200, 300);
        Global.room.add(lounge);
        lounge.addActionListener(this);
       
        billiardRoom = new JButton();
        billiardRoom.setBounds(450, 335, 200, 300);
        Global.room.add(billiardRoom);
        billiardRoom.addActionListener(this);
        


        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == buttonM) {
            assumption[0] = "Marcel";
            visible(Global.suspect, Global.weapon);
        }
        if (e.getSource() == buttonV) {
            assumption[0] = "Vasilica";
            visible(Global.suspect, Global.weapon);
        }
        if (e.getSource() == buttonG) {
            assumption[0] = "Gigela";
            visible(Global.suspect, Global.weapon);
        }
        if (e.getSource() == buttonR) {
            assumption[0] = "Relu";
            visible(Global.suspect, Global.weapon);
        }
        if (e.getSource() == buttonC) {
            assumption[0] = "Costel";
            visible(Global.suspect, Global.weapon);
        }
        if (e.getSource() == buttonE) {
            assumption[0] = "Eusebiu";
            visible(Global.suspect, Global.weapon);
        }
            
        if (e.getSource() == weaponS) {
            assumption[1] = "spoon";
            visible(Global.weapon, Global.room);
        }

        if (e.getSource() == weaponG) {
            assumption[1] = "gun";
            visible(Global.weapon, Global.room);
        }

        if (e.getSource() == weaponR) {
            assumption[1] = "rope";
            visible(Global.weapon, Global.room);
        }

        if (e.getSource() == weaponP) {
            assumption[1] = "poison";
            visible(Global.weapon, Global.room);
        }

        if (e.getSource() == weaponC) {
            assumption[1] = "crossbow";
            visible(Global.weapon, Global.room);
        }
        
        if (e.getSource() == weaponB) {
            assumption[1] = "broom";
            visible(Global.weapon, Global.room);
        }


    }
    // public static void main(String args[]) {
      //  ButtonListeners btnevents = new ButtonListeners();
   // }
}