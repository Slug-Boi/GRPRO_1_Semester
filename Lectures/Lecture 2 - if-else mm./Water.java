class Water {
    static void water() {
        double actual = 4.5; // mængden (i L) man drikker
        double weight = 80.0;
        double amount = 35.0;
        double result = weight * amount;
        double result_liters = result * 0.001;
            System.out.println("Du bør drikke " + result_liters +
                            "L og drikker faktisk " + actual + "L");
            System.out.println("Anbefaling:");           
    if (actual < result_liters) {
        System.out.println("Du drikker for lidt!");
    } 
    if (actual > result_liters) {
        System.out.print("Du drikker for meget!");
        if(actual > 4 ) {
            System.out.println(" Du må slet ikke drikke så meget vand!");
        }
    } 
// OPGAVE:
// Hvis 'actual' er mindre end 'result_liters' --> udskriv at man drikker for lidt
// Hvis 'actual' er større end 'result_liters' --> udskriv at man drikker for meget
// Hvis 'actual' er større end 4 --> man bør ikke få så meget vand!
// (jf. nettofitness.dk)
    }
}