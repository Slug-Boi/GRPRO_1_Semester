
public class TextView {
    ICustomerTracker cTracker;

    TextView(ICustomerTracker cTracker) {
        this.cTracker = cTracker;
    }

    void printToday() {
        System.out.println("Today: " + cTracker.today() + " customers");
    }

    void printAvgThisWeek() {
        System.out.println("Average this week: " + cTracker.avgThisWeek() + " customers");
    }

    void printComparedToWeek(int week) {
        if(cTracker.comparedToWeek(week) < 0) {
            System.out.println("Decrease by " + cTracker.comparedToWeek(week) + " customers"); 
        } else if(cTracker.comparedToWeek(week) > 0) {
            System.out.println("Increase by " + cTracker.comparedToWeek(week) + " customers"); 
        } else {
            System.out.println("No difference");
        }

    }
}
