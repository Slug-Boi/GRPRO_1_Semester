import java.util.Scanner;
public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String[] split = str.split("-");
        int i = 0;
        while(i < split.length) {
            char firstChar = split[i].charAt(0);
            System.out.print(firstChar);
            i++;
        }

    }
}