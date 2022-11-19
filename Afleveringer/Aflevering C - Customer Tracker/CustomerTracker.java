import java.util.*;

public class CustomerTracker implements ICustomerTracker {
    Map<Integer, int[]> customerData;
    int currentWeek;

    CustomerTracker(MockDB db, int currentWeek) {
        customerData = db.getCustomerData();
        this.currentWeek = currentWeek;
    }

    public int today() {
        int[] arr = customerData.get(currentWeek);
        int latest =  arr[(arr.length - 1)];
        return latest;
    }

    private double avgWeek(int week) {
        int[] arr = customerData.get(week);
        double sum = 0;
        double avg = 0;
        for(double num : arr) {
            sum = num + sum;
        }
        return avg = sum / arr.length;
    }
    
    public double avgThisWeek() {
        return avgWeek(currentWeek);
    }
    
    public double comparedToWeek(int week) {
        // evt gang med 100 convert to int og så divider med 100 
        return avgThisWeek() - avgWeek(week);
    }
    
    
}
