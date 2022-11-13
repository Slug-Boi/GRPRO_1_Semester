import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matches = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        int pythag = (int) (Math.sqrt(w * w + h * h)) ;

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < matches ; i++) {
            list.add(sc.nextInt());
        }
        for (Integer current : list) {
            if(current <= pythag) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }
}
