
import java.util.Scanner;
public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String echo = sc.nextLine();
        
        for(int i = 0 ; i < 3 ; i++) {
            System.out.print(echo + " ");
        }
        
    }
}