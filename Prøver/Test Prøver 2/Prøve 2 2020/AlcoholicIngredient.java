
public class AlcoholicIngredient extends EnergeticIngredient{
    protected int alcohol; // g
    
    AlcoholicIngredient(String name, String unit, int amount, int protein, int carbs, int fat, int alcohol) {
        super(name, unit, amount, protein, carbs, fat);
        this.alcohol = alcohol;
    }
    
    boolean isAlcoholic() {
        if(alcohol > 0) {
            return true;
        }
        return false;
    }
    
    @Override
    void doubleUp() {
        super.doubleUp();
        alcohol = alcohol * 2;
    }
    
    @Override
    int energy() {
        return 29 * alcohol +super.energy();
    }
    
    public String toString() {
        System.out.print(super.toString() + " ");
        if(alcohol > 0) {
            System.out.print("[alcohol:" + alcohol + "g]");
        }
        return "";
    }
    
}
