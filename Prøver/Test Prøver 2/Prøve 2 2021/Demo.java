

public class Demo {
    static void demo() {
        Hand myHand = new Hand();
        Card SpadesQueen = new FaceCard("Spades", "Queen");
        myHand.add(SpadesQueen);
        Card ClubsTwo = new NumberCard("Clubs", 2);
        myHand.add(ClubsTwo);
        Card SpadesNine = new NumberCard("Spades", 9);
        myHand.add(SpadesNine);
        myHand.display();
        
    }
}
