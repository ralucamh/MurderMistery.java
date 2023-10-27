import java.util.Random;

public class Algorithm {
    void makeassumption(){
        
    }
    
    void turn(String[] player){
       String v[];
       String question;
       int k = 0;
       Random r = new Random();
       int n;
       
       for(int i = 0; i < 4; i++){
          if (user[i].equals(assumption[0]) || user[i].equals(assumption[1]) || user[i].equals(assumption[2])){
            v[++k] = user[i]; 
          }
       }

       for(int i = 0; i < 4; i++){
          if (player2[i].equals(assumption[0]) || player2[i].equals(assumption[1]) || player2[i].equals(assumption[2])){
            v[++k] = player2[i]; 
          }
       }

       for(int i = 0; i < 4; i++){
          if (player3[i].equals(assumption[0]) || player3[i].equals(assumption[1]) || player3[i].equals(assumption[2])){
            v[++k] = player3[i]; 
          }
       }

       for(int i = 0; i < 4; i++){
          if (player4[i].equals(assumption[0]) || player4[i].equals(assumption[1]) || player4[i].equals(assumption[2])){
            v[++k] = player4[i]; 
          }
       }
       boolean ok;
        while(ok == false) {
         n = r.nextInt(k);
         for(int j = 0;j < 19; j++){
            if (checklist[j].equals(v[n]) && ! player.checked(v[n])){
                player.checked(v[n]) = true;
                ok = true;
                question = v[n];
            }
         }
         v[n] = null;
         for(int i = 0; i < k; i++) {
            if ( v[i] != NULL){
                ok1 = false;
            }
         }
         boolean ok1;
         if (ok1 == true) {
            ok = true;
         }
        }
       
       for (int i = 0; i < 19; i ++) {
        
       } 
    }
}