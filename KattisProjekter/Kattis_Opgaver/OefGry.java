
import java.util.*;
public class OefGry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int l = sc.nextInt();

        for(int i = 1 ; i <= l ; i++) {
            list.add(i);
        }
        
        for(int i = 0 ; i < l ; i++) {
            if(i >= 100) {
                i = 0;
                l = l - 100;
                
            }
            if(i > 0) {
                if(list.get(i) % 15 == 0) {
                    System.out.println("øfgrynt");
                } else{
                if(list.get(i) % 3 == 0) {
                    System.out.println("øf");
                } else if(list.get(i) % 5 == 0) {
                    System.out.println("grynt");
                } else {
                    System.out.println(list.get(i));
                }
            }
            } else {
                System.out.println(list.get(i));
            }
            
        }
        
    }
}