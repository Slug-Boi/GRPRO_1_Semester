import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArraySmoothening {
    public static void main(String[] args) throws IOException {
        //Too slow either try and do this in C++ or rewrite to be faster
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arrayNumbers = new ArrayList<>();

        String firstLine = reader.readLine();
        String[] splitFirstLine = firstLine.split(" ");
        int moves = Integer.parseInt(splitFirstLine[1]);

        String input = reader.readLine();
        String[] splitInput = input.split(" ");
        for(String s : splitInput) {
            arrayNumbers.add(Integer.parseInt(s));
        }

        Collections.sort(arrayNumbers);
        while(moves != 0) {
            int numMax = arrayNumbers.get(0);
            int max = Collections.frequency(arrayNumbers,arrayNumbers.get(0));
            for(Integer num : arrayNumbers) {
                if(max <= Collections.frequency(arrayNumbers, num)) {
                    max = Collections.frequency(arrayNumbers, num);
                    numMax = num;
                }
            }
            for(int i = 0 ; i < arrayNumbers.size() ; i++) {
                if(arrayNumbers.get(i).equals(numMax)) {
                    arrayNumbers.remove(i);
                    moves--;
                    break;
                }
            }
        }
        int maxFreq = 0;
        for(Integer num : arrayNumbers) {
            if(maxFreq < Collections.frequency(arrayNumbers, num)) {
                maxFreq = Collections.frequency(arrayNumbers,num);
            }
        }
        System.out.println(maxFreq);
    }
}
