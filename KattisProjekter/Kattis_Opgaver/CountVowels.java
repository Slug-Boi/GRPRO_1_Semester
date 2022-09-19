import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        int s = 0;
        for(int i = 0 ; i < input.length() ; i++) {
            char aChar = input.charAt(i);
            for(int j = 0 ; j < vowels.length ; j++) {
                if(String.valueOf(aChar).equals(vowels[j])) {
                    s++;
                }

            }
            
        }
        System.out.println(s);
    }
}
