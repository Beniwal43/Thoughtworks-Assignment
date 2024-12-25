package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    public void testOneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.calculatePower(1, 1));
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.calculatePower(2, 1));
    }

    @Test
    public void testTwoPowerTwoIsFour() {
        assertEquals(4, PowerFinder.calculatePower(2, 2));
    }

    @Test
    public void testThreePowerTwoIsNine() {
        assertEquals(9, PowerFinder.calculatePower(3, 2));
    }
}


