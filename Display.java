import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class MyListener implements ActionListener {


    Random r = new Random();
    int n;
    @Override
    public void actionPerformed(ActionEvent e) {
        n = r.nextInt(6) + 1;
        System.out.println(n);
        System.out.println(n);
    }

}
public class Display {
    void create() {
        JFrame frame = new JFrame ("Play");

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
 
        // Column Names
        String[] columnNames = { "Who?", "", "What?", "", "Where?", "" };
 
        // Initializing the JTable
        
        JTable j = new JTable(data, columnNames);
        j.setBounds(50, 100, 100, 100);
        j.setVisible(true);
        JScrollPane sp = new JScrollPane(j);
        Panel.add(sp);
        frame.add(Panel);
        //Panel.setLocation(250, 170);
        sp.setLocation(250, 75);


        JButton button = new JButton("Roll the dice");
        button.setBackground(Color.green);
        button.setPreferredSize(new Dimension(100, 30));
        frame.add(button, BorderLayout.SOUTH);
     
        MyListener myListener = new MyListener();
        button.addActionListener(myListener);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Display().create();
    }
}