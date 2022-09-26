
import java.util.*;
public class AdolescentArchitecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        List<String> str = new ArrayList<>();
        List<Double> nbr = new ArrayList<>();
        Map<String, Double> map = new HashMap<>();
        Scanner ss = new Scanner(System.in);

        for(int i = 0 ; i < amount ; i++) {
            String temp = ss.nextLine();
            String[] split = temp.split(" ");

            if(i < amount) {
                if(split[0].equals("cube") || split[0].equals("cylinder")) {
                    str.add(String.valueOf(i) + split[0]);
                    if(split[0].equals("cube")) {
                        nbr.add(Double.parseDouble(split[1])*2);
                    } else {
                        nbr.add(Double.parseDouble(split[1]) * Double.parseDouble(split[1]) * 3.14);
                    }

                } 
            }
        }
        System.out.println(str);

    }
}