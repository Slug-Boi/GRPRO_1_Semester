import java.util.*;
public class NineKnigts {
    static ArrayList<String> insertKnights(String line, ArrayList<String> knights) {
        String[] split = line.split("");
        List<String> temp = new ArrayList<>();

        temp = Arrays.asList(split);

        for(String current : temp) {
            knights.add(current);
        }

        return knights;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> board = new HashMap<>();

        ArrayList<String> knights = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++) {
            String str = sc.nextLine();
            insertKnights(str, knights);
        }
        //this wouldn't work due to limits with one key for multiple values
        for(int i = 0 ; i < 55 ; i++) {
            if(i <=15) {
                board.put(10 + i, knights.get(i)); 
            } else if(i <= 25) {
                board.put(20 + i, knights.get(i));
            } else if(i <= 35) {
                board.put(30 + i, knights.get(i));
            } else if(i <= 45) {
                board.put(40 + i, knights.get(i)); 
            } else if(i <= 55) {
                board.put(50 + i, knights.get(i)); 
            }

        }
        
    }
}