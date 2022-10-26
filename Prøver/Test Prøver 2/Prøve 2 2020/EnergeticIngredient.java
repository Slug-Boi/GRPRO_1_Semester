
public class EnergeticIngredient extends Ingredient {
    int protein;
    int carbs;
    int fat;
    
    EnergeticIngredient(String name, String unit, int amount, int protein, int carbs, int fat) {
        super(name,unit, amount);
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        
    }
    
    @Override
    void doubleUp(){
        super.doubleUp();
        protein = protein * 2;
        carbs = carbs * 2;
        fat = fat * 2;
    }
    
    @Override
    int energy() {
        return protein * 17 + carbs * 17 + fat * 37;
    }
    
    @Override
    public String toString() {
        System.out.print(super.toString() + " ");
        System.out.print("(" + energy() + "kJ)");
        if(protein > 0) {
            System.out.print("[protein:" + protein + "g]");
        } 
        if(carbs > 0) {
            System.out.print("[carbs:" + carbs + "g]");
        }
        if(fat > 0) {
            System.out.print("[fat:" + fat + "g]");
        }
        return "";
    }
}
