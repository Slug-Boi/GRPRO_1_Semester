import java.util.*;
class Month {
    static void friday() {
        int month = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if ( month >= 25 ) {
            System.out.println("Yes, it is the end of the month!");
                if ( month >= 30) {
                System.out.println("It is really close to the end of the month!");
                }
            
        } else {
            System.out.println("No it is not the end of the month!");
        }
    }
}