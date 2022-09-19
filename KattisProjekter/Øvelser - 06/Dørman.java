import java.util.*;
public class Dørman {
    static void bouncer(ArrayList<String> Queue) {
        HashSet<String> GuestList = new HashSet<>();
        GuestList.add("Mads");
        GuestList.add("Marlene");
        GuestList.add("Johannes");
        GuestList.add("Mads");
        GuestList.add("Din mor");
        GuestList.add("Kidd");
        GuestList.add("Icekiid");
        GuestList.add("Helle Thorning Schmidt");
        GuestList.add("Orgi-E");
        GuestList.add("Tessa");
        GuestList.add("Bai-D");
        GuestList.add("Jørgen");
        GuestList.add("Jørgen");
        GuestList.add("Mads");
        GuestList.add("Jonas Vingegaard");
        GuestList.add("Lars Løkke");
        GuestList.add("Leif Dahlgård");
        GuestList.add("Jan Klooood");
        GuestList.add("Knaldperlen")
        ;
        GuestList.add("Jørgen");

        HashSet<String> NoEntry = new HashSet<>(); 
        NoEntry.add("Claus");
        NoEntry.add("Sebastian");

        for(String current : Queue) {
            if(GuestList.contains(current)) {
                System.out.println(current + " may enter!");

            } else if(NoEntry.contains(current)) {
                System.out.println(current + " may NOT enter!");

            } else{
                System.out.println(current + " may enter if they pay 150 kr + 50 kr for wardrobe");
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<String> Queue = new ArrayList<>();
        Queue.add("Hans");
        Queue.add("Louise");
        Queue.add("Nynne");
        Queue.add("Johannes");
        Queue.add("Din mor");
        Queue.add("Peter Plys");
        Queue.add("Buzz Lightyear");
        Queue.add("Helle Thorning Schmidt");
        Queue.add("Orgi-E");
        Queue.add("Tessa");
        Queue.add("Bai-D");
        Queue.add("Mads");
        Queue.add("Mads");
        Queue.add("Mads");
        Queue.add("Claus");
        Queue.add("Sebastian");
        Queue.add("Leif Dahlgård");
        Queue.add("Jan Klooood");
        Queue.add("Claus");
        Queue.add("Sebastian");
        Queue.add("ITU studerende der fejrer ét 12 tal");
        Queue.add("ITU studerende der vil glemme sit 00");
        Queue.add("Jørgen");

        bouncer(Queue);

    }
}