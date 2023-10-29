import java.awt.*;
import java.util.*;

public class Play {
    public static int[][] suspicion2 = new int[4][19];
    public static int[][] suspicion3 = new int[4][19];
    public static int[][] suspicion4 = new int[4][19];
    public static boolean[] myChecklist = new boolean[19];
    public static boolean[] checklist2 = new boolean[19];
    public static boolean[] checklist3 = new boolean[19];
    public static boolean[] checklist4 = new boolean[19];
    public static int winner = -1;

    Algorithm alg = new Algorithm();
    void game() {
        while (winner == -1) {
        if (dice == 5 || dice == 6) {
        // assumption
        alg.turns(myChecklist, 0);
        alg.makeassumption (checklist2, suspicion2);
        alg.turns (checklist2, 1);
        alg.makeassumption (checklist3, suspicion3);
        alg.turn (player[2], checklist3, 2);
        alg.makeassumption (checklist4, suspicion4);
        alg.turn (player[3], checklist4, 3);
    } elalg
      if (dice == 3 || dice == 4) {
        alg.turn1 (player[0]);
        alg.makeassumption (checklist2, suspicion2);
        alg.turn1 (player[1]);
        alg.makeassumption (checklist3, suspicion3);
        alg.turn1 (player[2]);
        alg.makeassumption (checklist4, suspicion4);
        alg.turn1 (Deck.players[3]);
      }

    }
}
}

