

public class NumberCard extends Card{
    protected int number;
    
    public NumberCard(String suit, int number) {
        super(suit);
        this.number = number;
    }
    
    public int getValue() {
        return number;
    }
    
    public String toString() {
        return "" + number + " of " + suit;
    }
}
