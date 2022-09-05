import java.util.Scanner;
public class Digit_Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int twod = input.nextInt(); 
        
        
            int dtwo = twod % 10;
            twod = twod / 10;
            int done = twod % 10;
            String one = String.valueOf(done);
            String two = String.valueOf(dtwo);
            System.out.println(two + one);
        }
    }
