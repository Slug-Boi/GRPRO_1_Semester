import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetBoolean {
    /*static boolean contains(HashSet <String> list, String element){
    for(String i : list) {
    if(i.equals(element)) {
    return true;
    } 
    }
    return false;
    } */

    public static void main(String[] args) {
        HashSet<String> students; // erklæring af variabel af typen ArrayList
        students = new HashSet<>(); // instantiering & initialisering af students
        students.add("John");
        students.add("Jane");
        Scanner sc = new Scanner(System.in);
        boolean isJim = students.contains("Jim"); // vi kalder contains MED students
        System.out.println(isJim);
        String student = sc.nextLine();
        if (students.contains(student)) { // vi kalder blot contains PÅ students!
            System.out.println(student + " is a student");
        } else {
            System.out.println(student + " is NOT a student");
        }
    }
}