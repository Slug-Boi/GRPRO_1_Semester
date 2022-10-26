
public abstract class Card {
    protected String suit;
    
    public Card(String suit) {
        this.suit = suit;
    }
    
    public abstract int getValue(); 
        
    
}

