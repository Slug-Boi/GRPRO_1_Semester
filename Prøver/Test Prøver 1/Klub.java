
import java.util.*;
public class Klub {
    private String navn;
    private ArrayList<Atlet> atleter;

    Klub(String navn) {
        this.navn = navn;
        atleter = new ArrayList<>();
    }

    void addAtlet(Atlet atlet) {
        atleter.add(atlet);
    }

    void visAlleAtleter() {
        System.out.println(navn);
        System.out.println("--------------------------");
        for(Atlet atlet : atleter) {
            atlet.display();
        }
    }

    void visAlleAtleter(boolean samletValue) {
        double sum = 0;
        if(samletValue == false) {
            System.out.println(navn);
            System.out.println("--------------------------");
            for(Atlet current : atleter) {
                current.display();
            }
        } else {
            System.out.println(navn);
            System.out.println("--------------------------");
            for(Atlet current : atleter) {
                current.display();
                sum = sum + current.getPris();
            }
            System.out.println("--------------------------");
            System.out.println("Samlet value: " + sum + " kr");
        }
    }

    void inflation(double pct) {
        for(Atlet atlet : atleter) {
            atlet.opdaterPris(atlet.getPris() * ((pct / 100)+1));
        }
    }
    
    int numSwim() {
        int swimmers = 0;
        for(Atlet atlet : atleter) {
            if(atlet.isSwimmer() == true) {
                swimmers++;
            } 
        }
        return swimmers;
    }
    
    Atlet[] getSwimmers() {
        Atlet[] swimmers = new Atlet[numSwim()];
        int i = 0;
        for(Atlet atlet : atleter) {
            if(atlet.isSwimmer() == true) {
                swimmers[i] = atlet;
            }
        }
        return swimmers;
    }
}