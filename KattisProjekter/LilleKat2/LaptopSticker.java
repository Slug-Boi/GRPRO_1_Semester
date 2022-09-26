
import java.util.*;
public class LaptopSticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int wc = sc.nextInt(), hc = sc.nextInt(), ws = sc.nextInt(), hs = sc.nextInt(); 
        
        if(wc - 1 > ws && hc - 1 > hs) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        
    }
}