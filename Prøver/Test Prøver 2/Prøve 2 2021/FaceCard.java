
public class FaceCard extends Card{
    protected String face;
    
    public FaceCard(String suit, String face) {
        super(suit);
        this.face = face;
    }
    
    public int getValue() {
        return 10;
    }
    
    public String toString() {
        return "" + face + " of " + suit;
    }
}
