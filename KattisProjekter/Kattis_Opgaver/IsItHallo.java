import java.util.Scanner;
public class IsItHallo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner scI = new Scanner(System.in);
    String str = sc.nextLine();
    int a = sc.nextInt();
    String HalM = "OCT";
    int HalD = 31;
    String HalMD = "DEC";
    int HalDD = 25;
    if (str + " " + a == HalM + " " + HalD || str + " " + a == HalMD + " " + HalDD) {
        System.out.println("yup");
            } else {
                System.out.println("nope");
            }
    
    }
    
    // note to self it needs to be a single string as input and then check
    // from there
}