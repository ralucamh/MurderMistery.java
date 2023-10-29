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

    }
}


