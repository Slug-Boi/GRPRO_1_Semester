import java.util.ArrayList;
import java.util.HashSet;
public class NamesLengthAmount {
    public static int uniqueNames(ArrayList<String> names) {
        HashSet<Integer> list = new HashSet<>();
        for(String i : names) {
            list.add(i.length());
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