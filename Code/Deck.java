import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Deck {
    public static String[][] players = new String[4][4];
    public static String[] deck = new String[19];
    void assign() {
         
        Random rand = new Random();
        
        String[] solution = new String[3];

        deck[0] = "Marcela";
        deck[1] = "Vasilica";
        deck[2] = "Gigela";
        deck[3] = "Relu";
        deck[4] = "Costel";
        deck[5] = "Eusebiu";

        deck[6] = "Spoon";
        deck[7] = "Gun";
        deck[8] = "Rope";
        deck[9] = "Poison";
        deck[10] = "Crossbow";
        deck[11] = "Broom";

        deck[12] = "kitchen";
        deck[13] = "study";
        deck[14] = "lounge";
        deck[15] = "library";
        deck[16] = "billiardRoom";
        deck[17] = "conservatory";
        deck[18] = "hall";

        int m = rand.nextInt(6);
        solution[0] = deck[m];
        deck[m] = " ";

        m = rand.nextInt(6) + 6;
        solution[1] = deck[m];
        deck[m] = " ";

        m = rand.nextInt(7) + 12;
        solution[2] = deck[m];
        deck[m] = " ";

        for (int i = 0; i < 4; i++) {
            while (players[0][i] == null) {
                int n = rand.nextInt(19);
                if (!deck[n].equals(" ")) {
                    players[0][i] = deck[n]; 
                    deck[n] = " ";
                }
            }
        }


        for (int i = 0; i < 4; i++) {
            ImageIcon j = new ImageIcon("images/" + players[0][i] + ".jpg");
            JButton h = new JButton(j);
            h.setBounds(5+(i*170), 10, 170, 270);
            Global.frame.add(h);
            Global.frame.setLayout(null); 
        }

        for (int i = 0; i < 4; i++) {
            while (players[1][i] == null) {
                int n = rand.nextInt(19);
                if (!deck[n].equals(" ")) {
                    players[1][i] = deck[n]; 
                    deck[n] = " ";
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            while (players[2][i] == null) {
                int n = rand.nextInt(19);
                if (!deck[n].equals(" ")) {
                    players[2][i] = deck[n]; 
                    deck[n] = " ";
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            while (players[2][i] == null) {
                int n = rand.nextInt(19);
                if (!deck[n].equals(" ")) {
                    players[2][i] = deck[n]; 
                    deck[n] = " ";
                }
            }

        deck[0] = "Marcela";
        deck[1] = "Vasilica";
        deck[2] = "Gigela";
        deck[3] = "Relu";
        deck[4] = "Costel";
        deck[5] = "Eusebiu";

        deck[6] = "Spoon";
        deck[7] = "Gun";
        deck[8] = "Rope";
        deck[9] = "Poison";
        deck[10] = "Crossbow";
        deck[11] = "Broom";

        deck[12] = "kitchen";
        deck[13] = "study";
        deck[14] = "lounge";
        deck[15] = "library";
        deck[16] = "billiardRoom";
        deck[17] = "conservatory";
        deck[18] = "hall";

        Play p = new Play();
        for (int k = 0; k < 4; k++) {
            for (int j = 0; j < 19; j ++) {
                if (players[0][k].equals(deck[j])) {
                    p.myChecklist[j] = true;
                }
            }
        }
        }
    
    }
}
