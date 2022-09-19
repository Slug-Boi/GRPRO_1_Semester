class vand {
    static void drik() {
        double weight = 84.5; // kg
        double WatPrKilo = 35.0; // ml
        double amount = weight * WatPrKilo;
        double warm = ((10)/100.0)+1;
    
        double amountHot;
        amount = Math.round(amount); 
        amountHot = Math.round(amount*warm);
        System.out.println("Du skal drikke:  " + amount + " ml " + 
                            " Når din vægt er: " + weight + "."); 
        System.out.println("Hvis det er varmt så skal du drikke: "
                            + amountHot + " ml");
                            
        //man kunne lave om til L ved at dividere med 100
    }
}