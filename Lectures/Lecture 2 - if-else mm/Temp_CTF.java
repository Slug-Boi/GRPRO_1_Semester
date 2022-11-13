public class Temp_CTF {
    static void CTF() {
        double C = 100;
        double F = C * 9 / 5 + 32;
        
        
        System.out.println(F);
    }
    static void FTC() {
        double F = 212;
        double C = (F-32) * 5 / 9;
        
        System.out.println(C);
    }
    static void FTCUnd() {
        double F = 451;
        double C = C = ((F-32)*5)/9;
        
        System.out.println(C);
        
        C = Math.round(C);
        
        System.out.print("Fahrenheit 451 = Celsius " + C );
    }
}