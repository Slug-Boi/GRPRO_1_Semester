import java.util.Scanner;
public class Windmill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        int c = n;
        int countpos = 0;
        int countneg = 0;
        
        
        while (n != w) {
            if (n != w) {
                if (n == 359) {
                n = 0;
                countpos++;
                } else {
                countpos = countpos + 1;
                n = n + 1;
                }
            } 
            
        
    } 
    
        while (c != w) {
            if (c != w) {
                
                if (c == 0) {
                c = 359;
                countneg--;
                } else {
                countneg = countneg - 1;
                c = c - 1;
                }
            } 
        
        
    }
        
    if(countpos == -countneg) {
        System.out.println(countpos);
    } else {
        if(countpos < -countneg) {
            System.out.println(countpos);
        } else {
            System.out.println(countneg);
        
        }
    }
    }
}
