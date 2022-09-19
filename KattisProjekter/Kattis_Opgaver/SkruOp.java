import java.util.Scanner;
public class SkruOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int req = sc.nextInt();
        String[] myarray = new String[req + 1];
        int volume = 7;
        for(int i = 0 ; i <= req; i = i + 1) {
            myarray[i] = sc.nextLine(); 
        }
        for(int j = 1 ; j < myarray.length; j++) {
            if( myarray[j].equals("Skru op!")) {
                if(volume != 10) {
                    volume = volume + 1;
                } 
            } else {
                if(volume != 0) {
                volume = volume - 1;
            }
        } 
    }
    System.out.println(volume);
}
}