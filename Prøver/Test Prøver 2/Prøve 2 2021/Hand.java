import java.util.*;
public class Hand {
    private List<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    void add(Card card) {
        cards.add(card);
    }
    
    public int total() {
        int sum = 0;
        for(Card card : cards) {
            sum = sum + card.getValue();
        }
        return sum;
    }
    
    void display() {
        System.out.println(total());
        for(Card card : cards) {
            System.out.println(card);
        }
    }
}
