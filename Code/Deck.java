import java.util.Random; 

import javax.swing.JButton;

public class Deck {
    
    void assign() {
        Random rand = new Random();

        String[] deck = new String[19];
        String[][] players = new String[4][4];
        String[] solution = new String[3];

        deck[0] = "Marcela";
        deck[1] = "Vasilica";
        deck[2] = "Gigela";
        deck[3] = "Relu";
        deck[4] = "Costel";
        deck[5] = "Eusebiu";

        deck[6] = "spoon";
        deck[7] = "gun";
        deck[8] = "rope";
        deck[9] = "poison";
        deck[10] = "crossbow";
        deck[11] = "broom";

        deck[12] = "";
        deck[13] = "";
        deck[14] = "";
        deck[15] = "";
        deck[16] = "";
        deck[17] = "";
        deck[18] = "";

    

        for (int i = 0; i < 3; i++) {
            int n = rand.nextInt(19);
            if (deck[n] != null) {
                solution[i] = deck[n];
                deck[n] = "";
            }
        } 

        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(19);
            if (deck[n] != null) {
                players[i][0] = deck[n]; 
                deck[n] = "";
            }
        }

        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(19);
            if (deck[n] != null) {
                players[i][1] = deck[n];
                deck[n] = "";
            }
        }

        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(19);
            if (deck[n] != null) {
                players[i][2] = deck[n];
                deck[n] = "";
            }
        }

        for (int i = 0; i < 4; i++) {
            int n = rand.nextInt(19);
            if (deck[n] != null) {
                players[i][3] = deck[n];
                deck[n] = "";
            }
        }

    
    }
}
