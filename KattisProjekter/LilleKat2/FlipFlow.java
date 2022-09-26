import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FlipFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        int t = sc.nextInt(), s = sc.nextInt(), n = sc.nextInt();

        String flipstr = ss.nextLine();
        String[] flipArr = flipstr.split(" ");
        List<Integer> flips = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            flips.add(Integer.parseInt(flipArr[i]));
        }
        flips.add(0);
        int time = 0;
        int timeDown = s;
        int flipping = 2;

        for(int i = 0 ; i < n ; i++) {
            if(i != n - 1) {
                if(flipping % 2 == 0) {
                    time = time + (flips.get(i + 1) - flips.get(i));
                    timeDown = timeDown - (flips.get(i + 1) - flips.get(i));
                    flipping++;
                } else if(flipping % 2 == 1) {
                    timeDown = timeDown + (flips.get(i + 1) - flips.get(i));
                    time = time - (flips.get(i + 1) - flips.get(i));
                    flipping--;
                } 
            }else if (flipping % 2 == 1) {
                time = time - (t - flips.get(i));
                if(time < 0) {
                    System.out.println(0);
                } else {
                    System.out.println(time);
                }
            } else if(flipping % 2 == 0) {
                timeDown = timeDown - (t - flips.get(i));
                if(timeDown < 0) {
                    System.out.println(0);
                } else {
                    System.out.println(timeDown);
                }
            }
            if(i > 0) {
                if(timeDown - (flips.get(i + 1) - flips.get(i)) < 0) {
                    timeDown = 0;
                } else if(timeDown + (flips.get(i + 1) - flips.get(i)) > s) {
                    timeDown = s;
                }
                if(time + (flips.get(i + 1) - flips.get(i)) > s) {
                    time = s;
                } else if(time - (flips.get(i + 1) - flips.get(i)) < 0) {
                    time = 0;
                }
            }
        }
    }
}