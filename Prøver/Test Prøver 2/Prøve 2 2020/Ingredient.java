
public class Ingredient {
    protected String name;
    protected String unit;
    protected int amount;    

    Ingredient(String name, String unit, int amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount; 
    }

    void doubleUp() {
        amount = amount * 2;
    }

    int energy(){
        return 0;
    }

    public String toString(){
        return ""+ amount + unit + " " + name; 
    }
}
