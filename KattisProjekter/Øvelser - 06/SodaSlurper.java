import java.util.*;
public class SodaSlurper {
    static int buy(int total,int cost, ArrayList<Integer> leftover) {
        int bought = 0;
        if(leftover.size() != 0){
            total = total + leftover.get(leftover.size() - 1);
        }
        if(leftover.size() == 0) {
            bought = total / cost;
            leftover.add(total % cost); 
        } else if(total == 1 && leftover.contains(1)) {
            bought = (total / cost);
        } else {
            leftover.add(total % cost); 
            bought = (total / cost);
        }

        return bought;
    }

    static int total(ArrayList<Integer> drank) {
        int sum = 0;
        for(int i = 0 ; i < drank.size() ; i++) {
            sum = drank.get(i) + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> drank = new ArrayList<>();
        ArrayList<Integer> leftovers = new ArrayList<>();
        int start = sc.nextInt(), found = sc.nextInt(), cost = sc.nextInt();

        int total = start + found;

        int firstTrade = buy(total, cost, leftovers);
        drank.add(firstTrade);
        for(int i = cost ; i <= drank.get(drank.size() - 1) + leftovers.get(drank.size() -1) ; i = i) {
            if(drank.get(drank.size() - 1) + leftovers.get(drank.size() -1) >= cost) {
                drank.add(buy(drank.get(drank.size() - 1), cost,leftovers));
            } 
        }
        /*System.out.println(drank);
        System.out.println(leftovers);
        */
        System.out.println(total(drank));
    }
}
