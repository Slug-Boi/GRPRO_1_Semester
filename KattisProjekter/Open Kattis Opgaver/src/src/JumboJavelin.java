import java.util.Scanner;
public class JumboJavelin {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amount = sc.nextInt();
        int[] jav = new int[amount];
        for(int i = 0 ; i < jav.length ; i++) {
            jav[i] = sc.nextInt();
        }
        int sum = jav[0];
        for(int i = 1 ; i < jav.length ; i++) {
            sum = sum + jav[i] - 1; 
        }
        System.out.println(sum);
        
   }
}
