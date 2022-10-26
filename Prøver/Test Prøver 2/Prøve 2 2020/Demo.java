

public class Demo {
    static void demo() {
        Cocktail espressoMartini = new Cocktail("Espresso Martini");
        Ingredient coffeeBeans = new Ingredient("coffee beans", "x", 1);
        espressoMartini.add(coffeeBeans);
        Ingredient espresso = new EnergeticIngredient("espresso", "cl", 4, 2, 54/2, 56/2);
        espressoMartini.add(espresso);
        Ingredient vodka = new AlcoholicIngredient("vodka", "cl", 4,0, 0, 0, 4);
        espressoMartini.add(vodka);
        Ingredient kahlua = new AlcoholicIngredient("kahlua", "cl", 4, 0, 30/2, 0, 2);
        espressoMartini.add(kahlua);
        
        espressoMartini.doubleUp();
        espressoMartini.recipe();
        
    }
}
