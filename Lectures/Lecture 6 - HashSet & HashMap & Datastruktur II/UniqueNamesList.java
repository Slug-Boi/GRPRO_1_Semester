import java.util.ArrayList;
import java.util.HashSet;
public class UniqueNamesList {
    public static int uniqueNames(ArrayList<String> names) {
        HashSet<String> list = new HashSet<>();
        for(String i : names) {
            list.add(i);
        }
        
        return list.size();
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Jonas");
        names.add("Alexander");
        names.add("Theis");
        names.add("Jonas");
        
        System.out.println(uniqueNames(names));
    }
}