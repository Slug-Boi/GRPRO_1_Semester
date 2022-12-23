import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<Integer>();

        for(int i = 0 ; i < 5 ; i++) {
            int one = sc.nextInt(), two = sc.nextInt(), three = sc.nextInt(), four = sc.nextInt();
            int sum = one + two + three + four;
            scores.add(sum);
        }

        int max = scores.get(0);
        int index = 0;
        for(Integer score : scores) {
            if(score > max) {
                max = score;
                index = scores.indexOf(score);
            }
        }

        System.out.println(index + 1 + " " + max);
    }
}
