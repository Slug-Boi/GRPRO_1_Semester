import java.util.Scanner;
public class aFuriousCocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt(), t = sc.nextInt();
        int [] array = new int[p];
        for(int i = 0 ; i < p ; i++) {
            array[i] = sc.nextInt();
        }
        int totime = t * p;
        int j = 0;
        int conc = 0;
        int max = 0;
        while(j < p) {
        if(array[j] >= max) {
            max = array[j];
            j++;
        }
        j++;
    }
    int timeAfter = t * (p - 1); 
    int maxAfter= max - timeAfter;
    if(maxAfter != 0) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}
}