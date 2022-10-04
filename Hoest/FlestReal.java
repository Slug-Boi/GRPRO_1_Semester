
import java.util.*;
public class FlestReal {
    static void check(String[] splitNote, String[] splitMenu, Map<String, Integer> map) {
        int count = 0;
        
        List<String> list = Arrays.asList(splitNote);
        
        //checks for wether or not the current value of strintNote is in our map
        // if not then it adds it with a count. This value then gets saved into the map
        for(int k = 0 ; k < splitMenu.length ; k++) {
            if(list.contains(splitMenu[k])) {
                if(!map.containsKey(splitMenu[k])) {
                    map.put(splitMenu[k], 1);
                    return;
                } else {
                    count = 1 + map.get(splitMenu[k]);
                    map.put(splitMenu[k], count);
                    return;
                }
            }
        }
    }

    public static List<String> biggest(Map<String, Integer> map, String[] splitMenu) {
        int biggest = (Collections.max(map.values()));
        List<String> list = new ArrayList<>();
        //this function iterates over our map entries to find the biggest key value pair
        //Once this is found it adds it to the list and checks if others are equal to this.
        //Once the list is done it gets returned
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == biggest) {
                list.add(entry.getKey());
                
            }
        }
        //here we sort the list in alphabetical order
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Map<String, Integer> map = new HashMap<>();

        String menu = sc.nextLine().toLowerCase();
        int amount = Integer.parseInt(sc.nextLine());
        //sc.nextLine();
        String[] splitMenu = menu.split(" ");
        //input string. removes all special characters and splits it into
        // a string with all lower case characters
        for(int i = 0 ; i < amount ; i++) {
            String note = sc.nextLine().toLowerCase();
            note = note.replaceAll("[,.!?]", "");
            String[] splitNote = note.split(" ");
            //check method is run here on our split string as well as menu and map
            check(splitNote, splitMenu, map);
        }
        //for each loop printing the sorted list
        for(String current : biggest(map, splitMenu)) {
            System.out.println(current);
        }
    }
}
