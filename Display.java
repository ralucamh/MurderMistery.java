import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Global {
    public static String[] assumption = {"", "", ""};
    public static JFrame frame = new JFrame ("Play");
    public static JFrame suspect = new JFrame("Make an assumption." + '\n' + "Choose a suspect");
    public static JFrame weapon = new JFrame("Make an assumption." + '\n' + "Choose a weapon");
    public static JFrame room = new JFrame("Make an assumption." + '\n' + "Choose a room");
}

class MyListener implements ActionListener {


    Random r = new Random();
    int n;
    @Override
    public void actionPerformed(ActionEvent e) {
        n = r.nextInt(6) + 1;
        if (n == 5 || n == 6) {

        }
        
    }

}

class MyListenerM implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Marcel";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}

class MyListenerV implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Vasilica";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}
class MyListenerG implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Gigela";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}

class MyListenerR implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Relu";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}

class MyListenerC implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Costel";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}

class MyListenerE implements ActionListener {
     
    @Override
     public void actionPerformed(ActionEvent e) {
        Global.assumption[0] = "Eusebiu";
        Global.suspect.setVisible(false);
        Global.weapon.setVisible(true);
    }
    
}
public class Display {
  
    void create() {
        

        JPanel Panel = new JPanel();
        String[][] data = {
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""},
            { "", "", "", "", "", ""}
        };
 
        
        String[] columnNames = { "Who?", "", "What?", "", "Where?", "" };
        
        JTable j = new JTable(data, columnNames);
        j.setBounds(50, 100, 100, 100);
        j.setVisible(true);
        JScrollPane sp = new JScrollPane(j);
        Panel.add(sp);
        Global.frame.add(Panel);
        //Panel.setLocation(250, 170);
        sp.setLocation(250, 75);

        JButton button = new JButton("Roll the dice");
        button.setBackground(Color.green);
        button.setPreferredSize(new Dimension(100, 30));
        Global.frame.add(button, BorderLayout.SOUTH);
        MyListener myListener = new MyListener();
        button.addActionListener(myListener);

        Global.frame.setSize(500, 500);
        Global.frame.setVisible(true);
        Global.frame.setLocationRelativeTo(null);
        Global.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

    }

    void suspects() {

        JFrame suspect = new JFrame("Make an assumption." + '\n' + "Choose a suspect");

        JButton buttonM = new JButton("Roll the dice");
        buttonM.setBackground(Color.green);
        buttonM.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonM, BorderLayout.SOUTH);
        MyListenerM myListenerM = new MyListenerM();
        buttonM.addActionListener(myListenerM);

        JButton buttonV = new JButton("Roll the dice");
        buttonV.setBackground(Color.green);
        buttonV.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonV, BorderLayout.SOUTH);
        MyListenerV myListenerV = new MyListenerV();
        buttonV.addActionListener(myListenerV);

        JButton buttonG = new JButton("Roll the dice");
        buttonG.setBackground(Color.green);
        buttonG.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonG, BorderLayout.SOUTH);
        MyListenerG myListenerG = new MyListenerG();
        buttonG.addActionListener(myListenerG);

        JButton buttonR = new JButton("Roll the dice");
        buttonM.setBackground(Color.green);
        buttonM.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonR, BorderLayout.SOUTH);
        MyListenerR myListenerR = new MyListenerR();
        buttonR.addActionListener(myListenerR);

        JButton buttonC = new JButton("Roll the dice");
        buttonM.setBackground(Color.green);
        buttonM.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonC, BorderLayout.SOUTH);
        MyListenerC myListenerC = new MyListenerC();
        buttonM.addActionListener(myListenerC);

        JButton buttonE = new JButton("Roll the dice");
        buttonM.setBackground(Color.green);
        buttonM.setPreferredSize(new Dimension(100, 30));
        suspect.add(buttonE, BorderLayout.SOUTH);
        MyListenerE myListenerE = new MyListenerE();
        buttonM.addActionListener(myListenerE);
    }

    public static void main(String[] args) {
        new Display().create();
    }
}
