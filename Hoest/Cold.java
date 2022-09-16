import java.util.Scanner;
import java.util.Arrays;
public class Cold {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int[] array = new int[a]; //String split???
        
        for(int i=0; i<a; i++) {
        array[i]=sc.nextInt();  
    }
    
        int i = 0;
        int countneg = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                countneg++;
                i++;
            } else {
                i++;
            }
    }
    System.out.println(countneg);
}
}