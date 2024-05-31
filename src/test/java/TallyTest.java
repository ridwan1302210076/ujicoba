import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.java.Tally;

public class TallyTest {

    @Test
    public void testInitialize() {
        Tally testTally = new Tally();
        
        for (int i = 0; i < 10; i++) {
            testTally.add();
        }
        
        testTally.initialize();
        
        assertEquals(0, testTally.getTally());
    }

    @Test
    public void testAdd() {
        Tally testTally = new Tally();
        
        for (int i = 1; i < 10; i++) {
            testTally.add();
            assertEquals(i, testTally.getTally());
        }
    }

    @Test
    public void testSubtract() {
        Tally testTally = new Tally();
        
        for (int i = 1; i < 10; i++) {
            testTally.subtract();
            assertEquals(-i, testTally.getTally());
        }
    }
}
