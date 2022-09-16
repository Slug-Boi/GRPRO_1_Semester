import java.util.Scanner;
public class Autori {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String[] split = name.split("-");
    int arraysize = split.length;
    for (int i = 0 ; i > arraysize ; i++) {
        System.out.print(split.charAt(i));
    }
 
    }
}
