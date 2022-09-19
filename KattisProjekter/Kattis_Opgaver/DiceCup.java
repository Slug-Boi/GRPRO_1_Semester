import java.util.Scanner;
public class DiceCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dOne = sc.nextInt(), dTwo = sc.nextInt();
        
        int sumOne = dOne;
        for (int i = dOne ; i > 0 ; i--) {
           sumOne = sumOne + (dOne - 1);
           System.out.println(sumOne);
        }
        
       
        
    }
    
}