import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    private LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
        System.out.println("Running a test...");
    }

    @Test
    void isTheYear1600ALeapYear() {
        assertTrue(leapYear.isLeapYear(1600));
    }

    @Test
    void isTheYearNegative1600ALeapYear() {
        assertFalse(leapYear.isLeapYear(-1600));
    }

    @Test
    void isTheYear2017ALeapYear() {
        assertFalse(leapYear.isLeapYear(2017));
    }

    @Test
    void isTheYear2020ALeapYear() {
        assertTrue(leapYear.isLeapYear(2020));
    }
    @Test
    void isTheYear2000ALeapYear() {
        assertTrue(leapYear.isLeapYear(2000));
    }
}