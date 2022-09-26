import java.util.*;
public class MixtapeManaement {
    public static void main(String[] args) {
        //create a arraylist with 100 elements of random values with the length between 1 and 4
        
        List<Integer> files = new ArrayList<>();
        
        for(int i = 0 ; i < 100 ; i++) {
            int ran = new Random().nextInt(8000);
            files.add(ran);
        }
        
        Collections.sort(files);
        
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        
        int n = sc.nextInt();
        String order = ss.nextLine();
        
        String[] split = order.split(" ");
        List<Integer> orderL = new ArrayList<>();
        for(String current : split) {
            orderL.add(Integer.parseInt(current));
        }
        System.out.println(orderL);
        
        for(int current : orderL) {
            System.out.print(files.get(current - 1) + " ");
            
        }
        
    }
}
