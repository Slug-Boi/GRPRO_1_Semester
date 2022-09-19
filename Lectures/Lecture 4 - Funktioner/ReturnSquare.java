public class ReturnSquare {
    static int fiveSquare() {
        int x = 5;
        return x * x;
    }
    static int fourSquare() {
        int x = 4;
        return x * x;
    }
    static void kald() {
        System.out.println(fiveSquare() + fourSquare());
    }
}