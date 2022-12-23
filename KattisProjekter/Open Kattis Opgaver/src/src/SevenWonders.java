import java.util.*;
public class SevenWonders {
    static int count(String letter, List<String> list) {
        int count = 0;
        for(int i = 0 ; i < list.size() ; i++) {
            if(list.get(i).equals(letter)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> play = new ArrayList<>();
        
        String input = sc.nextLine();
        
        String split[] = input.split(""); 
        
        play = Arrays.asList(split);
        
        int C = count("C",play);
        int T = count("T",play);
        int G = count("G",play);
        int min = C;
        if(min > T){
            min = T;
        }
        if(min > G) {
            min = G;
        }
        int points = 0;
        if(C >= 1 && T >= 1 && G >= 1) {
            points = C*C + T*T + G*G + 7*(min);
        } else {
            points = C*C + T*T + G*G;
        }
        System.out.println(points);
    }
}