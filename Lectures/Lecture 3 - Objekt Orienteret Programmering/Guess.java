import java.util.Scanner; 
import java.util.Random; 
class Guess {
    static void guess() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int secret = random.nextInt(100);
    int tries = 0;
    int guess = -1;
    
    while ( secret != guess ) {
    System.out.println("Make a guess");
    
        // så længe der ikke er gættet rigtigt {
        // output make a guess
    guess = scanner.nextInt(); // indtast gæt
    if (guess == secret) {
        System.out.println("Tillykke, du gættede tallet som var: " + secret);
        System.out.println("Du brugte " + tries + " gæt");
    } else {
        tries = tries + 1;
        if(guess < secret) {
            System.out.println("For lavt");
        } else {
            System.out.println("For højt");
        }
        // opdatér 'tries'
        // hvis guess er mindre end secret, så udskriv 'for lavt'
        // hvis guess er større end secret, så udskriv 'for højt'
        // }
        // skriv 'tillykke, du gættede tallet som var: ...'
        // skriv 'du brugte ... gæt'
    }
}
}
}