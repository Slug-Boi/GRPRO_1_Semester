import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String greet = sc.nextLine();
        
        String[] split = greet.split("");
        System.out.print("h");
        for(int i = 0 ; i < split.length ; i++) {
            if(split[i].equals("e")) {
                System.out.print("ee");
            }
        }
        System.out.print("y");
    }
}
