import java.util.*;
public class GodDrikkevare {
    static boolean isGoodBeverage(String name) {
        if(!name.toLowerCase().equals("Coca Cola Light".toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isGoodBeverage(String name, Set<String> badBeverages) {
        if(!badBeverages.contains(name)) {
            return true;
        } else {
            return false;
        }
    }

    static List<String> goodBeverages(List<String> beverages, Set<String> badBeverages) {
        List<String> goodBeverages = new ArrayList<>();
        for(String current : beverages) {
            if(!badBeverages.contains(current.toLowerCase())) {
                goodBeverages.add(current);
            }
        }

        return goodBeverages;
    }

    static void test1() {
        Set<String> badBeverages = new HashSet<>();
        badBeverages.add("Coca Cola Light");
        badBeverages.add("Grøn sport saftevand");
        System.out.println(isGoodBeverage("Coca Cola Light", badBeverages));
        System.out.println(isGoodBeverage("Pepsi Max", badBeverages));
    }

    static void test2() {
        Set<String> badBeverages = new HashSet<>();
        badBeverages.add("coca cola light");
        badBeverages.add("grøn sport saftevand");

        List<String> beverages = new ArrayList<>();
        beverages.add("Coca Cola Light");
        beverages.add("Pepsi Max");
        beverages.add("Pepsi");
        beverages.add("Vand");

        System.out.println(goodBeverages(beverages, badBeverages));

    }

    static HashMap<String, Integer> test3() {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("Pepsi Max".toLowerCase(), 3);
        score.put("Coca Cola".toLowerCase(), 10);
        score.put("Pepsi".toLowerCase(), 7);
        return score;
    }

    static HashMap<String, Integer> getMap() {
        return test3(); //no idea how this is supposed to return test3 without
        //test3 having a return type....
    }

    static void printBeverages(Map<String, Integer> scores, List<String> beverages) {
        System.out.println("You have the following beverages");
        for(String current : beverages) {
            if(scores.containsKey(current.toLowerCase())) {
                System.out.println("-" + current + "(score: " + scores.get(current) + ")"); 
            } else {
                System.out.println("-" + current + "(score: ? )");
            }
        } 
    }
    
    static void test4() {
        List<String> beverages = new ArrayList<>();
        beverages.add("pepsi");
        beverages.add("pepsi max");
        beverages.add("vand");
        
        Map<String, Integer> scores = getMap();
        
        printBeverages(scores, beverages);
        
    }
}