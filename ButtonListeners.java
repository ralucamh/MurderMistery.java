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

    JButton deck[] = new JButton[4];


    JButton weaponS;
    JButton weaponG;
    JButton weaponR;
    JButton weaponP;
    JButton weaponC;
    JButton weaponB;

    ImageIcon v = new ImageIcon("C:\\Users\\marza\\OneDrive\\Desktop\\Eindhoven\\Programming\\Assignments\\Cluedo\\MurderMistery.java\\MurderMistery\\Vasilica.jpg");

    String[] assumption = {"", "", ""};
    
    public ButtonListeners() {

        Global.suspect.setSize(700, 700);
        Global.suspect.setLocationRelativeTo(null);
        Global.suspect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jTextField = new JTextArea("Hello", 10, 10);
        Global.suspect.add(jTextField);

        /*JButton b=new JButton();  
        b.setBounds(50,100,95,30);  
        Global.suspect.add(b);  */
       
        Global.suspect.setLayout(null);  
        //Global.suspect.setVisible(true);   

        buttonM = new JButton(v);
        buttonM.setBounds(30, 25, 200, 300);
        Global.suspect.add(buttonM);
        buttonM.addActionListener(this); 
        
        buttonC = new JButton();
        buttonC.setBounds(240, 25, 200, 300);
        Global.suspect.add(buttonC);
        buttonC.addActionListener(this); 
         
        buttonG = new JButton();
        buttonG.setBounds(450, 25, 200, 300);
        Global.suspect.add(buttonG);
        buttonG.addActionListener(this); 
        
        buttonR = new JButton();
        buttonR.setBounds(30, 335, 200, 300);
        Global.suspect.add(buttonR);
        buttonR.addActionListener(this); 

        buttonV = new JButton();
        buttonV.setBounds(240, 335, 200, 300); 
        Global.suspect.add(buttonV);
        buttonV.addActionListener(this);

        buttonE = new JButton();
        buttonE.setBounds(450, 335, 200, 300);
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

    public void paintDeck(String[] deck){
        for (int i = 0; i< 4; i++){
            this.deck[i] = new JButton(deck[i]);
            Global.frame.add(this.deck[i]);
        }
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
            System.out.println("last");
        }
        //if (e.getSource() == buttonE) {
        //    assumption[0] = "Eusebiu";
           
        //}
              
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