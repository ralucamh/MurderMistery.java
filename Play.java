public class Play {
    public static int[][] suspicion2 = new int[4][19];
    public static int[][] suspicion3 = new int[4][19];
    public static int[][] suspicion4 = new int[4][19];
    public static boolean[] myChecklist = new boolean[19];
    public static boolean[] checklist2 = new boolean[19];
    public static boolean[] checklist3 = new boolean[19];
    public static boolean[] checklist4 = new boolean[19];
    public static int winner = -1;
    void game() {
        while (winner == -1) {
        if (dice == 5 || dice == 6) {
        // assumption
        Algorithm.turn (player[0], myChecklist, 0);
        makeassumption (checklist2, suspicion2);
        turn (player[1], checklist2, 1);
        makeassumption (checklist3, suspicion3);
        turn (player[2], checklist3, 2);
        makeassumption (checklist4, suspicion4);
        turn (player[3], checklist4, 3);
    } else
      if (dice == 3 || dice == 4) {
        turn (player[0]);
        makeassumption (checklist2, suspicion2);
        turn (player[1]);
        makeassumption (checklist3, suspicion3);
        turn (player[2]);
        makeassumption (checklist4, suspicion4);
        turn (player[3]);
      }

    }
}
}

