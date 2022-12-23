import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        String inputNum = sc.nextLine();
        String[] splitNum = inputNum.split(" ");


        numbers.add(Integer.parseInt(splitNum[0]));
        numbers.add(Integer.parseInt(splitNum[1]));
        numbers.add(Integer.parseInt(splitNum[2]));
        Collections.sort(numbers);

        String inputStr = sc.nextLine();
        String[] splitStr = inputStr.split("");
        letters.add(splitStr[0]);
        letters.add(splitStr[1]);
        letters.add(splitStr[2]);

        for(int i = 0 ; i < 3 ; i++) {
            if(letters.get(i).equals("A")) {
                System.out.print(numbers.get(0));
            } else if(letters.get(i).equals("B")) {
                System.out.print(numbers.get(1));
            } else {
                System.out.print(numbers.get(2));
            }
            System.out.print(" ");
        }
    }
}
