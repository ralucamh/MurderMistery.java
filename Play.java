import java.awt.*;
import java.util.*;

public class Play {
    public int[][] suspicion2 = new int[4][19];
    public int[][] suspicion3 = new int[4][19];
    public int[][] suspicion4 = new int[4][19];
    public boolean[] myChecklist = new boolean[19];
    public boolean[] checklist2 = new boolean[19];
    public boolean[] checklist3 = new boolean[19];
    public boolean[] checklist4 = new boolean[19];
    public int winner = -1;

    Display d = new Display();
    Algorithm alg = new Algorithm();

    void game() {
          for (int i = 0; i < 19; i ++) {
            if (myChecklist[i] == true) {
              if (i >= 0 && i < 6) {
                d.data[i][1] = "X";
              } else
              if (i >= 6 && i < 12) {
                d.data[i][3] = "X";
              } else 
              if (i >= 12 && i < 19) {
                d.data[i][5] = "X";
              }
            }
          }
          if (d.n == 5 || d.n == 6) {
        // assumption
        
    } else
      if (d.n == 3 || d.n == 4) {
        alg.turn1 ();
        alg.makeassumption (checklist2, suspicion2);
        alg.turn1 ();
        alg.makeassumption (checklist3, suspicion3);
        alg.turn1 ();
        alg.makeassumption (checklist4, suspicion4);
        alg.turn1 ();
      }

    }
}


