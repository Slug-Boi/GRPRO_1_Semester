import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class ReverseOrderNames {
    public static ArrayList<String> uniqueNames(ArrayList<String> names) {
        //ArrayList<String> reverse = new
        Collections.sort(names, Collections.reverseOrder());
        return names;
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