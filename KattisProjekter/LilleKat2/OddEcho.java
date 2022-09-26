import java.util.Scanner;
import java.util.ArrayList;
public class OddEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        
        for(int i = 0 ; i <= len ; i++) {
            words.add(sc.nextLine());
        }
        
        
        for(int i = 1 ; i < words.size() ; i += 2) {
            System.out.println(words.get(i));
        }
        
    }
}