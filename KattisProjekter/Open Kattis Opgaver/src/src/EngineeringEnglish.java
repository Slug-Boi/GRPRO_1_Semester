import java.util.*;
public class EngineeringEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> Hash = new HashSet<>();
        List<String> list = new ArrayList<>();
        int i = 0;
        

        
       while(sc.hasNextLine()) {
           String input = sc.nextLine();
           String[] split = input.split(" ");
           for(String str : split) {
               list.add(str);
           }

       }
        
        
        for(String current : list) {
            if(Hash.contains(current.toUpperCase())) {
                System.out.print(" ");
            } else {
                System.out.print(current + " ");
                Hash.add(current.toUpperCase());
            }
        }
    }
}
