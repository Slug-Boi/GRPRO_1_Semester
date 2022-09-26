import java.util.*;
public class BabyBitesReal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        String[] split  = sc.nextLine().split(" ");
        
        boolean bool = false;
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("mumble") || split[i].equals(Integer.toString(i+1)))
                continue;
            bool = true;
        }
        String result = bool ? "something is fishy" : "makes sense";
        System.out.println(result);
    }
}