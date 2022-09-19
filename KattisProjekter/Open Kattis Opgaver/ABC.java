import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        //ABC, ACB, CBA, BAC, BCA
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int [] array = new int[3];
        for(int i = 0 ; i < 2 ; i++) {
            array[i] = sc.nextInt();
        }
        String abc = sc.nextLine();
        for(int i = 0 ; i < 2 ; i++) {
            if(array[i] > A){
                A = array[i];
            }
        }
        for(int i = 0 ; i < 2 ; i++) {
            if(array[i] < A){
                C = array[i];
            }
        }
        for(int i = 0 ; i < 2 ; i++) {
            if(array[i] < A && array[i] > B){
                B = array[i];
            }
        }
        String abc = sc.nextLine();
        
    }
}