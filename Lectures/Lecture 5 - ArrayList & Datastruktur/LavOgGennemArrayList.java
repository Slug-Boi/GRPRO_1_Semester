import java.util.ArrayList;
import java.util.Scanner;
public class LavOgGennemArrayList {
    static int min(ArrayList<Integer> liste){
        int lav = liste.get(0);
        for(int i = 0 ; i < liste.size() ; i++) {
            if(liste.get(i) < lav ) {
                lav = liste.get(i);
            }
        }
        return lav;
        /* Kan også laves med en for-each løkke
         * int lav = liste.get(0);
         * for(int current : liste) {
         *     if(current < lav) {
         *        lav = current;   
                 }
             }
         * return lav;
         *  man kan sætte lav = Integer.MAX_VALUE; og så tager det
         *  største tal muligt.
         */
    }
     static double average(ArrayList<Integer> liste) {
        int sum = 0;
        int avg = 0; 
        for(int i = 0 ; i < liste.size() ; i++) {
            if(i < liste.size()) {
                sum = liste.get(i) + sum;
            } 
        }
        avg = sum / liste.size();
        return avg;
        /* eksempel på for-each løkke
         * int sum = 0;
         * for(int current : liste){
         *     sum = sum + current;
         }
         * return ((double) sum) / liste.size(); 
         * 
         * 
         */
    }
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        for(int i = 0 ; i < size ; i++) {
            test.add(sc.nextInt());
        }
       
        
        System.out.println(min(test));
        System.out.println(average(test));
    }
}