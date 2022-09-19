import java.util.Scanner;
public class Kaniner {
    //Not right change something in B I think to make it work better
    public static int KaninA(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int amount = a;
        for(int i = 0 ; i < a ; i++) {
            amount = amount * (amount -1);
        }
        return amount;
    }
    public static int KaninB() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int amountB = a;
        for(int i = 0 ; i < a ; i++) {
            amountB = amountB * (amountB -1);
        }
        return amountB;
    }
    public static void main(String[] args){
        
        System.out.println(KaninA() + KaninB());
    }
}