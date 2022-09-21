
import java.util.*;
public class OefGryntFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int l = sc.nextInt();

        for(int i = 1 ; i <= l ; i++) {
            list.add(i);
        }

        for(int i = 0 ; i < l ; i++) {
            if(i > 0) {
                if((i + 1) % 15 == 0) {
                    System.out.println("øfgrynt");
                } else{
                    if((i + 1) % 3 == 0) {
                        System.out.println("øf");
                    } else if((i + 1) % 5 == 0) {
                        System.out.println("grynt");
                    } else if(i >= 100) {
                        System.out.println(list.get((i % 100))); 
                    } else if(i <= 100) {
                        System.out.println(list.get(i));
                    }
                }
            } else {
                System.out.println(list.get(i));
            } 
        }

    }

}
