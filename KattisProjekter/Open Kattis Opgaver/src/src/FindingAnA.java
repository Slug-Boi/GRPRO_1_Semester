import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] split = input.split("");
        int buffer = 0;
        for(int i = 0 ; i < split.length ; i++) {
            if(i < split.length) {
                if(split[i].equals("a") | buffer >= 1) {
                    System.out.print(split[i]);
                    buffer++;            }
            }
        }
    }
}
