import java.util.*;
public class Huskeseddel {
    static List<Integer> reverse(List<Integer> list) {
        Collections.reverse(list);

        return list;
    }

    static List<Integer> count(List<Integer> list) {
            
            for(int i = 3 ; i >= 0 ;i--) {
                if(list.get(i) == 9) {
                    list.set(i, 0);
                } else {
                    list.set(i, list.get(i) + 1);
                    return list;
                }
            }
            return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pin = sc.nextLine();

        String[] pinSp = pin.split("");
        List<Integer> list = new ArrayList<>();
        for(String current : pinSp) {
            list.add(Integer.parseInt(current));
        }

        
        if(list.get(3) != 9) {
            list.set(3, list.get(3) + 1);
        } else {
            count(list);
        }
        
        reverse(list);
        for(int current : list) {
            System.out.print(current);
        }
    }
}