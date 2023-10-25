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

    ImageIcon v = new ImageIcon("C:\\Vasilica.jpg");

    String[] assumption = {"", "", ""};
    
    public ButtonListeners() {

        Global.suspect.setSize(700, 700);
        Global.suspect.setLocationRelativeTo(null);
        Global.suspect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonM = new JButton(v);
        buttonM.setBounds(30, 30, 200, 240);
        Global.suspect.add(buttonM);
        buttonM.addActionListener(this); 

        buttonC = new JButton();
        buttonC.setBounds(240, 30, 200, 240);
        Global.suspect.add(buttonC);
        buttonC.addActionListener(this); 

        buttonG = new JButton();
        buttonG.setBounds(20, 40, 0, 0);
        Global.suspect.add(buttonM);
        buttonG.addActionListener(this); 

        buttonR = new JButton();
        buttonR.setBounds(100, 150, 0, 0);
        Global.suspect.add(buttonR);
        buttonR.addActionListener(this); 

        
        buttonV = new JButton();
        buttonV.setBounds(260, 30, 0, 0); 
        buttonM.setBackground(Color.green);
        Global.suspect.add(buttonV);
        buttonV.addActionListener(this);

        buttonE = new JButton();
        buttonE.setBounds(200, 150, 0, 0);
        Global.suspect.add(buttonE);
        buttonE.addActionListener(this); 

        weaponS = new JButton();
        weaponS.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponS);
        weaponS.addActionListener(this);

        weaponG = new JButton();
        weaponG.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponG);
        weaponG.addActionListener(this);

        weaponR = new JButton();
        weaponR.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponR);
        weaponR.addActionListener(this);

        weaponP = new JButton();
        weaponP.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponP);
        weaponP.addActionListener(this);

        weaponC = new JButton();
        weaponC.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponC);
        weaponC.addActionListener(this);

        weaponB = new JButton();
        weaponB.setBounds(100, 10, 200, 40);
        Global.weapon.add(weaponB);
        weaponB.addActionListener(this);

       

        
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == buttonM) {
            assumption[0] = "Marcel";
            System.out.println("ye");
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
              
        //Global.suspect.setVisible(false);
        //Global.weapon.setVisible(true);
            
        if (e.getSource() == weaponS) {
            assumption[1] = "spoon";
        }

        if (e.getSource() == weaponG) {
            assumption[1] = "gun";
        }

        if (e.getSource() == weaponR) {
            assumption[1] = "rope";
        }

        if (e.getSource() == weaponP) {
            assumption[1] = "poison";
        }

        if (e.getSource() == weaponC) {
            assumption[1] = "crossbow";
        }
        
        if (e.getSource() == weaponB) {
            assumption[1] = "broom";
        }


    }
    // public static void main(String args[]) {
      //  ButtonListeners btnevents = new ButtonListeners();
   // }
}