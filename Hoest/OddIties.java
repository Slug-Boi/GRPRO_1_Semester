import java.util.Scanner;
public class OddIties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int[] array = new int[a]; 

        for(int i=0; i<a; i++) {
            array[i]=sc.nextInt();  
        }
        int i = 0;
        while (i < array.length) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i] + " is even");
                i++;
            } else {
                System.out.println(array[i] + " is odd");
                i++;
            }

    
        }
    }
}