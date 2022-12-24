import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double whitespace = 0, lowercase = 0, uppercase = 0, symbols = 0;

        String input = sc.nextLine();
        char[] characters = input.toCharArray();

        for(char character : characters) {
        if(Character.isLowerCase(character)) {
           lowercase++;
        } else if (Character.isUpperCase(character)) {
            uppercase++;
        } else if (character == '_' ) {
            whitespace++;
        } else {
            symbols++;
        }
        }
        System.out.println(whitespace/input.length());//whitespace
        System.out.println(lowercase/input.length());//lowercase
        System.out.println(uppercase/input.length());//uppercase
        System.out.println(symbols/input.length());//symbols
    }
}
