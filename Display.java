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
        Panel.add(sp, BorderLayout.CENTER);
    
        //Panel.setLocation(250, 170);
      //  sp.setLocation(250, 75);

        JButton button = new JButton("Roll the dice");
        button.setBackground(Color.green);
        button.setBounds(150, 100, 20, 40);
        // button.setPreferredSize(new Dimension(100, 30));
        Panel.add(button, BorderLayout.SOUTH);
        MyListener myListener = new MyListener();
        button.addActionListener(myListener);

        Global.frame.add(Panel);
        Global.frame.setSize(500, 500);
        Global.frame.setVisible(true);
        Global.frame.setLocationRelativeTo(null);
        Global.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

    }

    public static void main(String[] args) {
        new Display().create();
    }
}
