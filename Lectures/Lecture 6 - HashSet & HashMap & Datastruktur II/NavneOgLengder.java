import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class NavneOgLengder {
    public static void nameLength() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Jonas");
        names.add("Alexander");
        names.add("Theis");
        names.add("Jonas");
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> nameLength = new ArrayList<>();
        
        //Mapper vores navnelængder som til mængden amount er altså mængden af gange
        //de enkelte navne med de længder optræder og det bliver så til vores value til
        //hvor key her er længden i sig selv på navnet
        for(String name : names) {
            int length = name.length();
            int amount = 0;
            if(map.containsKey(length)) {
                amount = map.get(length);
            }
            map.put(length, amount + 1);
            
        }
        
        System.out.println(map);
        //printer vores givne hashmap ud og den key som vi bruger dertil. Det giver altså
        //mængden af navne og deres længder som er mappet ovenover
        for(int i : map.keySet()) {
            int amount = map.get(i);
        System.out.println("Der er " + map.get(i) + " forskellige navne med længden " + i);
        
        }
    }
}