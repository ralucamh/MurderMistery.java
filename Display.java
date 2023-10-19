import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Global {
    public static JFrame frame = new JFrame ("Play");
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

public class Display {
  
    void create() {
        

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
        Color borderColor = new Color(0, 0, 0);
        Global.frame.add(button);

        MyListener myListener = new MyListener();
        button.addActionListener(myListener);

        Global.frame.add(panel);
        Global.frame.setSize(700, 700);
        Global.frame.setVisible(true);
        Global.frame.setLocationRelativeTo(null);
        Global.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

    }
    

    public static void main(String[] args) {
        new Display().create();
    }
}
