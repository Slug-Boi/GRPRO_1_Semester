import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 
public class Selvsikker {
 
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     String input = sc.nextLine();
     
     String[] array = input.split("\\?|\\s");
     int n = array.length;
     String[] arrayEx = new String[n + 1]; 
     for (int i = 0; i < array.length; i++){
      arrayEx[i] = array[i];
    }
     arrayEx[arrayEx.length -1 ] = "!";
      
     String swap = arrayEx[0];
     arrayEx[0] = arrayEx[1].substring(0, 1).toUpperCase() + arrayEx[1].substring(1);
     arrayEx[1] = swap.toLowerCase();
     
     
    
     for(int i = 0 ; i < arrayEx.length; i++) {
         if(i == arrayEx.length -2) {
             System.out.print(arrayEx[i]);
         } else {
         System.out.print(arrayEx[i] + " ");
     }
     
 }
}
}