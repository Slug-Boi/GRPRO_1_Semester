import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetUnique {
    public static int unique(ArrayList<Integer> list){
        HashSet<Integer> hSet = new HashSet<>();
        for(int i : list){
            hSet.add(i);
        }
        
        for(int i : hSet) {
            System.out.println(i);
        }
            System.out.println();
            return hSet.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 0 ; i < 5 ; i++) {
            num.add(sc.nextInt());
        }
        System.out.println("Amount of unique numbers: " + unique(num));
        
    }
}