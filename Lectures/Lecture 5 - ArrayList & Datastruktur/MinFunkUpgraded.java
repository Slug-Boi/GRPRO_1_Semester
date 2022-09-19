import java.util.ArrayList;
import java.util.Scanner;
public class MinFunkUpgraded {
    static int min(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }
    static int min(ArrayList<Integer> liste){
        int min = liste.get(0);
        for(int i = 1 ; i < liste.size() ; i++) {
            min = min(min, liste.get(i));
        }
        return min;
    }
    //mini er min(liste) men med en for-each løkke
    static int mini(ArrayList<Integer> liste){
        int currentMin = Integer.MAX_VALUE;
        for(int current : liste) {
            currentMin = min(current, currentMin);
        }
        return currentMin;
     
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
        for(int i = 0 ; i < size ; i++) {
            numbers.add(sc.nextInt());
        }
        
        System.out.println(min(numbers));
    }
}
