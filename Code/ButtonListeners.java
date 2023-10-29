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

     
    JButton p1;
    JButton p2;
    JButton p3;

    void visible(JFrame x, JFrame y) {
        x.setVisible(false);
        y.setVisible(true);
    }

    ImageIcon v = new ImageIcon("images/Vasilica.jpg");
    ImageIcon e = new ImageIcon("images/Eusebiu.jpg");
    ImageIcon m = new ImageIcon("images/Marcela.jpg");
    ImageIcon g = new ImageIcon("images/Gigela.jpg");
    ImageIcon r = new ImageIcon("images/Relu.jpg");
    ImageIcon c = new ImageIcon("images/Costel.jpg");
    ImageIcon broom = new ImageIcon("images/Broom.jpg");
    ImageIcon crossbow = new ImageIcon("images/Crossbow.jpg");
    ImageIcon gun = new ImageIcon("images/Gun.jpg");
    ImageIcon poison = new ImageIcon("images/Poison.jpg");
    ImageIcon spoon = new ImageIcon("images/Spoon.jpg");
    ImageIcon rope = new ImageIcon("images/Rope.jpg");
    ImageIcon s = new ImageIcon("images/study.jpg");
    ImageIcon k = new ImageIcon("images/kitchen.jpg");
    ImageIcon l = new ImageIcon("images/lounge.jpg");
    ImageIcon b = new ImageIcon("images/billiardRoom.jpg");
    ImageIcon h = new ImageIcon("images/hall.jpg");
    ImageIcon lib = new ImageIcon("images/library.jpg");
    ImageIcon co = new ImageIcon("images/conservatory.jpg");
    
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

        Global.choice.setSize(500, 500);
        Global.choice.setLocationRelativeTo(null);
        Global.choice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Global.choice.setLayout(null); 
        
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

        kitchen = new JButton(k);
        kitchen.setBounds(10, 35, 160, 264);
        Global.room.add(kitchen);
        kitchen.addActionListener(this);

        lounge = new JButton(l);
        lounge.setBounds(180, 35, 160, 264);
        Global.room.add(lounge);
        lounge.addActionListener(this);
       
        billiardRoom = new JButton(b);
        billiardRoom.setBounds(350, 35, 160, 264);
        Global.room.add(billiardRoom);
        billiardRoom.addActionListener(this);
        
        study = new JButton(s);
        study.setBounds(520, 35, 160, 264);
        Global.room.add(study);
        study.addActionListener(this);

        hall = new JButton(h);
        hall.setBounds(80, 330, 160, 264);
        Global.room.add(hall);
        hall.addActionListener(this);

        library = new JButton(lib);
        library.setBounds(265, 330, 160, 264);
        Global.room.add(library);
        library.addActionListener(this);

        conservatory = new JButton(co);
        conservatory.setBounds(450, 330, 160, 264);
        Global.room.add(conservatory);
        conservatory.addActionListener(this);
        
        p1 = new JButton("Player1");
        p1.setBounds(100, 50, 300, 100); 
        Global.choice.add(p1);

        p2 = new JButton("Player2");
        p2.setBounds(100, 175, 300, 100); 
        Global.choice.add(p2);

        p3 = new JButton("Player3");
        p3.setBounds(100, 300, 300, 100); 
        Global.choice.add(p3);
;   }


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

        
        Play p = new Play();
        Algorithm alg = new Algorithm();

        if (e.getSource() == kitchen) {
            assumption[2] = "kitchen";
            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == lounge) {
            assumption[2] = "lounge";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == billiardRoom) {
            assumption[2] = "billiardRoom";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == study) {
            assumption[2] = "study";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == hall) {
            assumption[2] = "hall";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == library) {
            assumption[2] = "library";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        if (e.getSource() == conservatory) {
            assumption[2] = "conservatory";

            alg.turn(p.myChecklist, 0);
            alg.makeassumption(p.checklist2, p.suspicion2);
            alg.turn(p.checklist2, 1);
            alg.makeassumption(p.checklist3, p.suspicion3);
            alg.turn(p.checklist3, 2);
            alg.makeassumption(p.checklist4, p.suspicion4);
            alg.turn(p.checklist4, 3);

            visible(Global.room, Global.frame);
        }

        /**if (e.getSource() == p1) {
            alg.n = 1;
        }
        **/

    }
}