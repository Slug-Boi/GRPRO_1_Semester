import java.util.Scanner;
public class RouteCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        
        if(num.startsWith("555")) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
    }
    
}