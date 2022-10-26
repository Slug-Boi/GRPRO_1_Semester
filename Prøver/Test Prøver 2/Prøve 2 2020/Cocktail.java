import java.util.*;
public class Cocktail {
    private String name;
    private ArrayList<Ingredient> ingredients;
    
    Cocktail(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }
    
    void add(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    
    void doubleUp() {
        for(Ingredient ingredient : ingredients) {
            ingredient.doubleUp();
        }
    }
    
    int totalEnergy() {
        int sum = 0;
        
        for(Ingredient ingredient : ingredients) {
            sum = ingredient.energy() + sum;
        }
        return sum;
    }
    
    void line(char c) {
        for(int i = 0; i < name.length() ; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    
    void recipe() {
        System.out.println(name);
        line('=');
        for(Ingredient ingredient : ingredients) {
            System.out.println("" + ingredient);
        }
        line('-');
        System.out.println(totalEnergy() + " kJ in TOTAL");
    }
}
