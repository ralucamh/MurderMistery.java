import java.util.Random;

public class Algorithm {
   String[] assumption;
   String ask;
   
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
         for(int j = 0; j < 4; j ++){
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
    
      for (int i = 12; i < 19; i ++) {
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

      for (int i = 12; i < 19; i ++) {
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
    
    void turn(String[][] player, boolean[] checklist){
      int suspicion[][]; 
      String v[];
      int w[];
       String question;
       int k = 0;
       Random r = new Random();
       int n;
       for (int i = 0; i < 4; i ++){
       for(int j = 0; j < 19; j ++) {
         suspicion[i][j] = 0; 
       }
      }
       for(int i = 0; i < 4; i++){
          if (player[0][i].equals(assumption[0]) || player[0][i].equals(assumption[1]) || player[0][i].equals(assumption[2])){
            v[++k] = player[0][i]; 
            w[k] = 0;
          }
       }

       for(int i = 0; i < 4; i++){
          if (player[1][i].equals(assumption[0]) || player[1][i].equals(assumption[1]) || player[1][i].equals(assumption[2])){
            v[++k] = player[1][i]; 
            w[k] = 1;
          }
       }

       for(int i = 0; i < 4; i++){
          if (player[2][i].equals(assumption[0]) || player[2][i].equals(assumption[1]) || player[2][i].equals(assumption[2])){
            v[++k] = player[2][i]; 
            w[k] = 2;
          }
       }

       for(int i = 0; i < 4; i++){
          if (player[3][i].equals(assumption[0]) || player[3][i].equals(assumption[1]) || player[3][i].equals(assumption[2])){
            v[++k] = player[3][i]; 
            w[k] = 3;
          }
       }
       boolean ok;
       int nr = 0;
        while(ok == false) {
         n = r.nextInt(k);
         for(int i = 0;i < 19; i ++){
            if (deck[i].equals(v[n]) && checklist[i] == false){
                checklist[i] = true;
                ok = true;
                for (int j = 0; j < k; j ++) {
                suspicion[w[n]][j] ++;
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
         System.out.println("");
       }

    }

    void turn1 () {
      boolean ok;
      int x;
      for (int i = 0; i < 19; i ++) {
         if (deck[i].equals(ask)) {
            x = i;
         }
      }
      for (int i = 0; i < 4; i ++) {
      if (player[n][i].equals(ask)) {
         ok = true;
         myChecklist[x] = true;
         checklist2[x] = true;
         checklist3[x] = true;
         checklist4[x] = true;
      }
    }

    if (ok == false) {
      for(int i = 0; i < 4; i ++) {
         suspicion[i][x] = -5;
      }
    }
}
}