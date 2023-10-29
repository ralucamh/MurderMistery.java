import java.util.*;

public class Algorithm {
   Deck d = new Deck();
   Play p = new Play();
   public static String[] assumption;
   public static String ask;
   public static int [][] suspicion = Play.suspicion2;
   void asksuspect(boolean[] checklist, int suspicion[][]) {

      int mx = 0;
      Random r = new Random();
      int n;
      for (int i = 0; i < 6; i ++) {
            for(int j = 0; j < 4; j ++){
               if (suspicion[j][i] > mx && checklist[i] == false) {
                  ask = d.deck[i];
                  mx = suspicion[j][i];
               }
         }
      }

      while (ask == null) {
      n = r.nextInt(6);
      if (checklist[n] == false) {
      ask = d.deck[n];
      }
   }
   }

   void askweapon(boolean[] checklist, int suspicion[][]) {
      
      int mx = 0;
      Random r = new Random();
      int n;
    for (int i = 6; i < 12; i ++) {
         for (int j = 0; j < 4; j ++) {
         if (suspicion[j][i] > mx && checklist[i] == false) {
            ask = d.deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      while (ask == null) {
      n = 6 + r.nextInt(6);
      if (checklist[n] == false) {
      ask = d.deck[n];
      }
   }
   }

   void askroom(boolean[] checklist, int suspicion[][]) {
      
      int mx = 0;
      Random r = new Random();
      int n;
    
      for (int i = 12; i < 19; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            ask = d.deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      while (ask == null) {
      n = 12 + r.nextInt(6);
      if (checklist[n] == false) {
      ask = d.deck[n];
      }
   }
   }
   
   void question (int x, boolean[] checklist, int suspicion[][]) {
      
      int nr1 = 0;
      int nr2 = 0;
      int nr3 = 0;
      int nrs1 = 0;
      int nrs2 = 0;
      int nrs3 = 0;
      int mn = 999;
      int mx = 0;

     for (int i = 0; i < 6; i ++) {
      if (checklist[i] == true) {
         nr1 ++;
      }
     }

     for (int i = 6; i < 12; i ++) {
      if (checklist[i] == true) {
         nr2 ++;
      }
     }

     for (int i = 12; i < 19; i ++) {
      if (checklist[i] == true) {
         nr2 ++;
      }
     }

     for (int i = 0; i < 6; i ++) {
         nrs1 = nrs1 + suspicion[x][i];
     }

     for (int i = 6; i < 12; i ++) {
      nrs2 = nrs2 + suspicion[x][i];
  }
     
     for (int i = 12; i < 19; i ++) {
         nrs3 = nrs3 + suspicion[x][i];
     }

     if (nr1 > nr2) {
      if (nr1 > nr3) {
         mx = nr1;
      } else {
         mx = nr3;
      }
     } else {
      if (nr2 > nr3) {
         mx = nr2;
      } else {
         mx = nr3;
      }
     }

     if (nrs1 < nrs2) {
      if (nrs1 < nrs3) {
         mn = nrs1;
      } else {
         mn = nrs3;
      }
     } else {
      if (nrs2 < nrs3) {
         mn = nrs2;
      } else {
         mn = nrs3;
      }
     }

     if (mx == nr1) {
      if (mx == nr2) {
            if (mx == nr3) {
               if (mn == nrs1) {
               asksuspect(checklist,suspicion);
            } else
            if (mn == nrs2) {
               askweapon(checklist,suspicion);
            } else
            if (mn == nrs3) {
               askroom(checklist,suspicion);
            }
         } else {
            if (mn == nrs1) {
               asksuspect(checklist,suspicion);
            } else
            if (mn == nrs2) {
               askweapon(checklist,suspicion);
            }
         }
            } else
            if(mx == nr3) {
               if (mn == nrs1) {
               asksuspect(checklist,suspicion);
            } else
            if (mn == nrs3) {
               askroom(checklist,suspicion);
            }
            } else {
               asksuspect(checklist,suspicion);
            }
         } else
         if (mx == nr2) {
            if (mx==nr3) {
               if (mn == nrs2) {
               askweapon(checklist,suspicion);
            } else
            if (mn == nrs3) {
               askroom(checklist,suspicion);
            }
            } else {
               askweapon(checklist,suspicion);
            }
         } else {
            askroom(checklist,suspicion);
         }
   
    
     
   }
    void makeassumption(boolean[] checklist, int[][] suspicion){
      
      int mx = 0;
      Random r = new Random();
      int n;
      
      for (int i = 0; i < 6; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[0] = d.deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      mx = 0;

       for (int i = 6; i < 12; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[1] = d.deck[i];
            mx = suspicion[j][i];
         }
      }
      }
      
      mx = 0;

      for (int i = 12; i < 19; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[2] = d.deck[i];
            mx = suspicion[j][i];
         }
      }
      }

   while (assumption[0] == null) {
      n = r.nextInt(6);
      if (checklist[n] == false) {
      assumption[0] = d.deck[n];
      }
   }

   while (assumption[1] == null) {
      n = 6 + r.nextInt(6);
      if (checklist[n] == false) {
      assumption[1] = d.deck[n];
      }
   }

   while (assumption[2] == null) {
      n = 12 + r.nextInt(7);
      if (checklist[n] == false) {
      assumption[2] = d.deck[n];
      }
   }
    }
    
     public void turn(boolean[] checklist, int x) {
      String v[] = new String[4];
      int w[] = new int[4];
       int k = 0;
       Random r = new Random();
       int n = 0;
       /** for (int i = 0; i < 4; i ++){
       for(int j = 0; j < 19; j ++) {
         suspicion[i][j] = 0; 
       }
      } **/   // move
      
      for (int i = 0; i < 4; i ++){
         int nb = 0;
         for(int j = 0; j < 19; j ++) {
           if (suspicion[i][j] > 1) {
            nb ++;
           }
           if (nb == 1) {
            if (suspicion[i][j] > 1) {
               checklist[j] = true;
            }
           }
         }
        }

      if (x != 0)
       {
         for(int i = 0; i < 4; i++){
          if (Deck.players[0][i].equals(assumption[0]) || Deck.players[0][i].equals(assumption[1]) || Deck.players[0][i].equals(assumption[2])){
            v[++k] = Deck.players[0][i]; 
            w[k] = 0;
          }
       }
      }
       
      if (x != 1) {
       for(int i = 0; i < 4; i++){
          if (Deck.players[1][i].equals(assumption[0]) || Deck.players[1][i].equals(assumption[1]) || Deck.players[1][i].equals(assumption[2])){
            v[++k] = Deck.players[1][i]; 
            w[k] = 1;
          }
       }
      }

      if (x != 2) {
       for(int i = 0; i < 4; i++){
          if (Deck.players[2][i].equals(assumption[0]) || Deck.players[2][i].equals(assumption[1]) || Deck.players[2][i].equals(assumption[2])){
            v[++k] = Deck.players[2][i]; 
            w[k] = 2;
          }
       }
      }

      if (x != 3) {
       for(int i = 0; i < 4; i++){
          if (Deck.players[3][i].equals(assumption[0]) || Deck.players[3][i].equals(assumption[1]) || Deck.players[3][i].equals(assumption[2])){
            v[++k] = Deck.players[3][i]; 
            w[k] = 3;
          }
       }
      }

      boolean ok = false;
       int nr = 0;
        while(ok == false) {
         n = r.nextInt(k);
         for(int i = 0;i < 19; i ++){
            if (d.deck[i].equals(v[n]) && checklist[i] == false){
                checklist[i] = true;
                
                ok = true;
                for (int j = 0; j < 4; j ++) {
                  for (int l = 0; l < 19; l++) {
                  if (d.deck[l].equals(v[k]));
                suspicion[j][l] = -10;
                }
               }
            }
         }
         if (ok == false) {
            nr ++;
         }
         
         if (nr == k) {
            ok = true;
         }
        }
       
       if (nr == k) {
         p.winner = x;
       }
        
       for (int i = 0; i < 3; i ++){
          if (x != 2 && w[n] != 2) {
            for (int j = 0; j < 19; j++) {
               if (assumption[i].equals(d.deck[j])) {
                  if (p.suspicion2[w[n]][j] == 0) {
            p.suspicion2[w[n]][j] ++;
          }
         }
         }
         }
       }

       for (int i = 0; i < 3; i ++){
          if (x != 3 && w[n] != 3) {
            for (int j = 0; j < 19; j++) {
               if (assumption[i].equals(d.deck[j])) {
            p.suspicion3[w[n]][j] ++;
          }
         }
         }
       } 
       
       for (int i = 0; i < 3; i ++){
          if (x != 4 && w[n] != 4) {
            for (int j = 0; j < 19; j++) {
               if (assumption[i].equals(d.deck[j])) {
            p.suspicion4[w[n]][j] ++;
          }
         }
         }
       }       
    }

    public void turn1 () {
      boolean ok = false;
      Random r = new Random();
      int n = r.nextInt(4); // random or smart
      int x = -1;
      for (int i = 0; i < 19; i ++) {
         if (d.deck[i].equals(ask)) {
            x = i;
         }
      }
      for (int i = 0; i < 4; i ++) {
      if (Deck.players[n][i].equals(ask)) {
         ok = true;
         p.myChecklist[x] = true;
         p.checklist2[x] = true;
         p.checklist3[x] = true;
         p.checklist4[x] = true;
      }
    }

    if (ok == false) {
      for(int i = 0; i < 4; i ++) {
         suspicion[i][x] = -1;
      }
    }
}

    public void turn1p (int n) {
      boolean ok = false;
      Random r = new Random();
      n = r.nextInt(4); // random or smart
      int x = -1;
      for (int i = 0; i < 19; i ++) {
         if (d.deck[i].equals(ask)) {
            x = i;
         }
      }
      for (int i = 0; i < 4; i ++) {
      if (Deck.players[n][i].equals(ask)) {
         ok = true;
         p.myChecklist[x] = true;
         p.checklist2[x] = true;
         p.checklist3[x] = true;
         p.checklist4[x] = true;
      }
    }

    if (ok == false) {
      for(int i = 0; i < 4; i ++) {
         suspicion[i][x] = -1;
      }
    }
}
}