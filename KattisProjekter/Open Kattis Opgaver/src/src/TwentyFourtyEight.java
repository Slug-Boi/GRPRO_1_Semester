import java.util.Scanner;

public class TwentyFourtyEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] matrix = new Integer[3][3];

        for(int i = 0 ; i < 4 ; i++) {
            String temp = sc.nextLine();
            String[] split = temp.split(" ");
                for(int j = 0 ; j < 4 ; j++) {
                    matrix[i][j] = Integer.parseInt(split[j]);
                }


        }
        int move = sc.nextInt();

        if(move == 0 ) {   //left
            
        }

    }
}
