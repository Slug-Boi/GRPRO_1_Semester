import java.util.*;
public class BabyBites {
    static String[] input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        
        String[] split = input.split(" ");
        
        return split;
    }
    static boolean check(String[] list, int l) {
        int next = 1;
        for(int i = 0 ; i < l - 1 + 1 ; i++) { 
            String nextstr = String.valueOf(next);
            if(!list[i].equals(nextstr)  && !list[i].equals("mumble")) { 
                return false;
            } else if(list[i].equals("mumble")) {
                next++;
            } else {
                next++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        
        String[] split = input();
        
        String[] list = new String[split.length + 1];
        for(int i = 0 ; i < split.length ; i++) {
            list[i] = split[i];
        }
        
        if(check(list, l) == true) {
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }
        
    }
}
