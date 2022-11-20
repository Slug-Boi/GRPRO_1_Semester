import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CustomerTrackerTest {
    MockDB db;
    CustomerTracker cTracker;

    @Before
    public void setUp() {
        //kør db's constructur
        db = new MockDB(); 
        cTracker = new CustomerTracker(db, 47);

    }

    @Test
    public void today_returns35() {
        //Arrange
        int expected = 35;
        //Act
        int actual = cTracker.today();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void avgThisWeek_returns30() {
        //Arrange
        double expected = 30.0;
        //Act
        double actual = cTracker.avgThisWeek();
        //Assert
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void comparedToWeek43() {
        //Arrange
        double expected = 2.85;
        //Act
        double actual = cTracker.comparedToWeek(43);
        //Assert
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void comparedToWeek47() {
        //Arrange
        double expected = 0.0;
        //Act
        double actual = cTracker.comparedToWeek(47);
        //Assert
        assertEquals(expected, actual, 0.0);
    }
    
    @Test
    public void comparedToWeek_given0_throwsAnException() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
          cTracker.comparedToWeek(0);  
        });
    }
    
    @Test
    public void comparedToWeek_given48_throwsAnException() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
          cTracker.comparedToWeek(48);  
        });
    }
    
    @After
    public void tearDown() {
        cTracker = null;
        db = null;

    }

}
