import java.util.Random;

public class Deck {
    
    Random rand = new Random();

    String[] deck = new String[19];
    String[] user = new String[4];
    String[] player1 = new String[4];
    String[] player2 = new String[4];
    String[] player3 = new String[4];
    String[] solution = new String[3];

    deck[0] = "Marcela";
    deck[1] = "Vasilica";
    deck[2] = "Gigela";
    deck[3] = "Relu";
    deck[4] = "Costel";
    deck[5] = "Eusebiu";

    deck[6] = "";
    deck[7] = "";
    deck[8] = "";
    deck[9] = "";
    deck[10] = "";
    deck[11] = "";

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
            user[i] = deck[n];
            deck[n] = "";
        }
    }

    for (int i = 0; i < 4; i++) {
        int n = rand.nextInt(19);
        if (deck[n] != null) {
            player1[i] = deck[n];
            deck[n] = "";
        }
    }

    for (int i = 0; i < 4; i++) {
        int n = rand.nextInt(19);
        if (deck[n] != null) {
            player2[i] = deck[n];
            deck[n] = "";
        }
    }

    for (int i = 0; i < 4; i++) {
        int n = rand.nextInt(19);
        if (deck[n] != null) {
            player3[i] = deck[n];
            deck[n] = "";
        }
    }

    
}

