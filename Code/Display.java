import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Global {
    public static JFrame frame = new JFrame("Play");
    public static JFrame suspect = new JFrame("Make an assumption.  Choose a suspect");

    public static JFrame    weapon = new JFrame("Make an assumption.    Choose a weapon");
    public static JFrame   room = new JFrame("Make an assumption.   Choose a room");

    public static JFrame choice = new JFrame("Choose the player who will show you a card");

}


public class Display implements ActionListener {
  
    void create() {

        Deck d = new Deck();

        JPanel panel = new JPanel();
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
  
        j.setRowHeight(30);
        JScrollPane sp = new JScrollPane(j);
        Global.frame.add(sp);
        sp.setSize(700, 230);
        sp.setVisible(true);

        sp.setLocation(0, 300);

        JButton button = new JButton("Roll the dice");
        Color colorOver = new Color(51, 153, 255);
        button.setBackground(colorOver);
        button.setBounds(265, 570, 170, 50);
        Global.frame.add(button);

        button.addActionListener(this);

        Global.frame.add(panel);
        Global.frame.setSize(700, 700);
        Global.frame.setVisible(true);
        Global.frame.setLocationRelativeTo(null);
        Global.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Global.frame.setLayout(null); 
    
        d.assign();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ButtonListeners btn = new ButtonListeners();

        Random r = new Random();
        int n;
        n = r.nextInt(6) + 1;
        System.out.println(n);
        if (n == 5 || n == 6) {
            Global.frame.setVisible(false);
            btn.actionPerformed(e);
            Global.suspect.setVisible(true);
        }
        if (n == 3 || n == 4) {
            Global.frame.setVisible(false);
            btn.actionPerformed(e);
            Global.choice.setVisible(true);
        }
        if (n == 1 || n ==2) {
            Global.frame.setVisible(false);
            JOptionPane.showMessageDialog(null, "Oops! You skip a turn :(");
        }
        
    }


    public static void main(String[] args) {
        new Display().create();
    }

}
