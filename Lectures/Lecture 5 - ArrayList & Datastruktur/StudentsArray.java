import java.util.ArrayList;
public class StudentsArray {
    static void printStudents(ArrayList<String> name) {
        System.out.println("Current Students:");
        
        printStudent(name);
    }
    static void printStudent(ArrayList<String> name) {
        for(String element : name) {
            System.out.println("- " + element);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sebestian");
        names.add("Alex");
        names.add("Geie");
        
        printStudents(names);
        
        
    }
}