import java.util.*;

public class Algorithm {
   String[] assumption;
   String ask;
   String[] deck = Deck.deck;
   int [][] suspicion = Play.suspicion;
   void asksuspect(boolean[] checklist, int suspicion[][]) {
      
      int mx = 0;
      Random r = new Random();
      int n;
    for (int i = 0; i < 6; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            ask = deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      while (ask == null) {
      n = r.nextInt(6);
      if (checklist[n] == false) {
      ask = deck[n];
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
            ask = deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      while (ask == null) {
      n = 6 + r.nextInt(6);
      if (checklist[n] == false) {
      ask = deck[n];
      }
   }
   }

   void askroom(boolean[] checklist, int suspicion[][]) {
      
      int mx = 0;
      Random r = new Random();
      int n;
    
      for (int i = 12; i < 18; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            ask = deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      while (ask == null) {
      n = 12 + r.nextInt(6);
      if (checklist[n] == false) {
      ask = deck[n];
      }
   }
   }
   
   void question (int x, int suspicion[][]) {
      
      int nr1 = 0;
      int nr2 = 0;
      int nr3 = 0;
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

     for (int i = 12; i < 18; i ++) {
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
     
     for (int i = 12; i < 18; i ++) {
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
         ms = nrs3;
      }
     }

     if (mx == nr1) {
      if (mx == nr2) {
         if (mx == nr3) {
            if ()
         }
      }
     }
   }
    void makeassumption(boolean[] checklist, int suspicion[][]){
      
      int mx = 0;
      Random r = new Random();
      int n;
      
      for (int i = 0; i < 6; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[0] = deck[i];
            mx = suspicion[j][i];
         }
      }
      }

      mx = 0;

       for (int i = 6; i < 12; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[1] = deck[i];
            mx = suspicion[j][i];
         }
      }
      }
      
      mx = 0;

      for (int i = 12; i < 18; i ++) {
         for(int j = 0; j < 4; j ++){
         if (suspicion[j][i] > mx && checklist[i] == false) {
            assumption[2] = deck[i];
            mx = suspicion[j][i];
         }
      }
      }

   while (assumption[0] == null) {
      n = r.nextInt(6);
      if (checklist[n] == false) {
      assumption[0] = deck[n];
      }
   }

   while (assumption[1] == null) {
      n = 6 + r.nextInt(6);
      if (checklist[n] == false) {
      assumption[1] = deck[n];
      }
   }

   while (assumption[2] == null) {
      n = 12 + r.nextInt(6);
      if (checklist[n] == false) {
      assumption[2] = deck[n];
      }
   }
    }
    
    void turn(String[][] player, boolean[] checklist, int x){
      String v[] = new String[4];
      int w[] = new int[4];
       int k = 0;
       Random r = new Random();
       int n;
       /** for (int i = 0; i < 4; i ++){
       for(int j = 0; j < 18; j ++) {
         suspicion[i][j] = 0; 
       }
      } **/   // move
      
      for (int i = 0; i < 4; i ++){
         int nb = 0;
         for(int j = 0; j < 18; j ++) {
           if (suspicion[i][j] == 1) {
            nb ++;
           }
           if (nb == 1) {
            if (suspicion[i][j] == 1) {
               if (j >= 0 && j < 6) {
                  answer[0] = deck[j];
               }

               if (j >= 6 && j < 12) {
                  answer[1] = deck[j];
               }

               if (j >= 12 && j < 18) {
                  answer[2] = deck[j];
               }
            }
           }
         }
        }

      if (x != 0)
       {
         for(int i = 0; i < 4; i++){
          if (player[0][i].equals(assumption[0]) || player[0][i].equals(assumption[1]) || player[0][i].equals(assumption[2])){
            v[++k] = player[0][i]; 
            w[k] = 0;
          }
       }
      }
       
      if (x != 1) {
       for(int i = 0; i < 4; i++){
          if (player[1][i].equals(assumption[0]) || player[1][i].equals(assumption[1]) || player[1][i].equals(assumption[2])){
            v[++k] = player[1][i]; 
            w[k] = 1;
          }
       }
      }

      if (x != 2) {
       for(int i = 0; i < 4; i++){
          if (player[2][i].equals(assumption[0]) || player[2][i].equals(assumption[1]) || player[2][i].equals(assumption[2])){
            v[++k] = player[2][i]; 
            w[k] = 2;
          }
       }
      }

      if (x != 3) {
       for(int i = 0; i < 4; i++){
          if (player[3][i].equals(assumption[0]) || player[3][i].equals(assumption[1]) || player[3][i].equals(assumption[2])){
            v[++k] = player[3][i]; 
            w[k] = 3;
          }
       }
      }
       for (int i = 0; i < 4; i ++){
          if (x != i) {
            suspicion2[w[n]][i1];
          }
       }
      boolean ok = false;
       int nr = 0;
       int i1;
        while(ok == false) {
         n = r.nextInt(k);
         for(int i = 0;i < 18; i ++){
            if (deck[i].equals(v[n]) && checklist[i] == false){
               i1 = i;
                checklist[i] = true;
                ok = true;
                for (int j = 0; j < 4; j ++) {
                  for (int l = 0; l < 18; l++) {
                  if (deck[l].equals(v[k]));
                suspicion[j][l] = 0;
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
         Play.ok = true;
       }
        
       if (x != 1) {
         Play.suspicion2[w[n]][i1] = 1;
      }
      
      if (x != 2) {
         Play.suspicion3[w[n]][i1] = 1;
      }
       
      if (x != 3) {
         Play.suspicion4[w[n]][i1] = 1;
      }
    }

    void turn1 (String[][] player) {
      boolean ok = false;
      Random r = new Random();
      int n = r.nextInt(4); // random or smart
      int x = -1;
      for (int i = 0; i < 18; i ++) {
         if (deck[i].equals(ask)) {
            x = i;
         }
      }
      for (int i = 0; i < 4; i ++) {
      if (player[n][i].equals(ask)) {
         ok = true;
         Play.myChecklist[x] = true;
         Play.checklist2[x] = true;
         Play.checklist3[x] = true;
         Play.checklist4[x] = true;
      }
    }

    if (ok == false) {
      for(int i = 0; i < 4; i ++) {
         suspicion[i][x] = -5;
      }
    }
}
}