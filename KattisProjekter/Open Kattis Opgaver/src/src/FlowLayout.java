import java.util.ArrayList;
import java.util.Scanner;

public class FlowLayout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int tempSize = 0;
        int newLine = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        int endP = 1;


        while(endP != 0) {
            if(sc.nextLine().equals("0")) {
                endP = 0;
            } else {
                while(true) {
                    if(sc.nextLine().equals("-1 -1")) {
                        break;
                    } else {
                        String tempS = sc.nextLine();
                        String[] split = tempS.split(" ");
                        for(String s : split) {
                            list.add(Integer.parseInt(s));
                        }
                    }


                }
                int size = list.get(0);
                for(int i = 1 ; i < list.size() ; i = i +2); {
                    int j = 2;
                    int i = 1;
                    if (list.get(i) + tempSize < size) {
                        tempSize = list.get(i) + tempSize;
                        i = + 2;

                    } else {
                        maxHeight = list.get(j) + list.get(j + 2);
                        j = j + 2;
                        maxWidth = tempSize;
                        tempSize = 0;
                        if (list.get(i) + tempSize < size) {
                            tempSize = list.get(i) + tempSize;
                            i = + 2;
                        }

                    }


                }
                System.out.println(maxWidth + " x " + maxHeight);
            }

        }
    }
}
