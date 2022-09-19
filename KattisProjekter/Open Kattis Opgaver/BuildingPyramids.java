import java.util.Scanner;
public class BuildingPyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int blocks = sc.nextInt();
        for(int i = 1 ; i * i < blocks ; i = i + 2) {
            int sum = i * i;
            blocks = blocks - sum;
            count++;
        }
        System.out.println(blocks);
        System.out.print(count);
        
        
    }
    
}