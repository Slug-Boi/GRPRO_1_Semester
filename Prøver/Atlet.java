
import java.util.*;
public class Atlet {
    private String navn;
    private String sportsgren;
    private double pris;
    private int alder;
    
    Atlet(String navn, String sportsgren, int alder, double pris) {
        this.navn = navn;
        this.sportsgren = sportsgren;
        this.alder = alder;
        this.pris = pris;
    }
    
    public void opdaterPris(double nyPris) {
        pris = nyPris;
    }
    
    double getPris() {
        return pris;
    }
    
    double predSalgspris() {
        double predPris = pris - (0.95 * Math.abs(25-alder));
        return predPris;
    }
    
    void display() {
        System.out.println(navn + " (" + alder + ") - " + sportsgren + ": " + pris + " kr (" + predSalgspris() + " kr)"); 
    }
    
    boolean isSwimmer() {
        if(sportsgren.toLowerCase().equals("swim")) {
            return true;
        } 
        return false;
    }
    
}
