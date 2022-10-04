
import java.util.*;
public class Demo {
    public static void
    main(String[] args) {
        // 3b) erklær og

        Klub minKlub = new Klub("SWU United"); 

        // 3c) opret og tilføj de
        Atlet MichaelPhelps = new Atlet("Michael Phelps", "", 34, 1358.016);
        Atlet superDan = new Atlet("super Dan", "", 27, 1650.0000000000002);
        Atlet LilleClaus = new Atlet("Lille Claus", "", 19, 1100);
        Atlet GunholdRee = new Atlet("Gunhold Ree", "", 49, 1358.016);
        Atlet JulieKepp = new Atlet("Julie Kepp", "", 19, 4715.700000000001);
        Atlet KimDietrichsen = new Atlet("Kim Dietrichsen", "", 32, 3455.1000000000004);
        minKlub.addAtlet(MichaelPhelps);
        minKlub.addAtlet(superDan);
        minKlub.addAtlet(LilleClaus);
        minKlub.addAtlet(GunholdRee);
        minKlub.addAtlet(JulieKepp);
        minKlub.addAtlet(KimDietrichsen);
        // 3d) udskriv klubbens
        minKlub.visAlleAtleter();
        System.out.println("--------------------------");

        // 3e) udskriv klubbens
        minKlub.inflation(10);
        minKlub.visAlleAtleter(true);

        /*for(Atlet atlet : atleter.getSwimmers()) {
            atlet.display();
        }*/
    }
}
