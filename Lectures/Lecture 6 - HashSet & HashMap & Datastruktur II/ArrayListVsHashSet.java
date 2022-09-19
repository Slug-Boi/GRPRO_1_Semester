import java.util.ArrayList;
import java.util.HashSet;
public class ArrayListVsHashSet {
    public static void main(String[] args) {
        //This list includes 1 2 1 3 2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        for(Integer i : list) {
            System.out.println(i);
        }
        System.out.println();
        //HashSet has unique elements so each thing can only appear once
        //Thus this list would only include 1 2 3
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);
        
        for(Integer i : set) {
            System.out.println(i);
        }
    }
}
