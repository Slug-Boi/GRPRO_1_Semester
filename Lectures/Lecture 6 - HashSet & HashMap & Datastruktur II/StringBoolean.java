import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class StringBoolean {
    static boolean contains(ArrayList <String> list, String element){
        for(String i : list) {
            if(i.equals(element)) {
                return true;
            } 
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<String> students; // erklæring af variabel af typen ArrayList
        students = new ArrayList<>(); // instantiering & initialisering af students
        students.add("John");
        students.add("Jane");
        Scanner sc = new Scanner(System.in);
        boolean isJim = contains(students, "Jim"); // vi kalder contains MED students
        System.out.println(isJim);
        String student = sc.nextLine();
        if (contains(students, student)) { // vi kalder contains MED students
            System.out.println(student + " is a student");
        } else {
            System.out.println(student + " is NOT a student");
        }
    }
}