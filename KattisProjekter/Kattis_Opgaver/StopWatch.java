import java.util.Scanner;
import java.util.ArrayList;
public class StopWatch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int press = sc.nextInt();
        ArrayList<Integer> times = new ArrayList<>();
        int RunTime = 0;
        for(int i = 0 ; i <= press ; i++) {
            times.add(sc.nextInt());
        }
        if(times.size() % 2 == 1) {
            System.out.println("still running");
        } else {
            
        }
        
        
    }
}