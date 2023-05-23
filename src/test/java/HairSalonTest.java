import org.junit.Test;
import unitTesting.Calculator;
import unitTesting.HairSalon;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

public class HairSalonTest {
    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays(){
        String[] expected = {"Monday", "Tuesday"};
        String[] answer = hairSalon.getOpeningDays();
        assertArrayEquals(expected, answer);
    }

    @Test
    public void testSalonIsOpenOnMonday(){
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday(){
        assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekDayDoesNotEndInDay(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("Christmas"));
        String expected = "Day entered must end in d-a-y (Monday, Tuesday etc.)";
        String answer = exception.getMessage();
        assertEquals(expected, answer);
    }

    @Test
    public void testCanReturnHaircutPrice(){
        int expected = 30;
        int answer = hairSalon.getHaircutPrice();
        assertEquals(expected, answer);
    }

    @Test
    public void testApplyDiscount(){
        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSalon.getHaircutPrice(), 2) == 15);
        int expected = 20;
        int answer = hairSalon.applyDiscount();
        assertEquals(expected, answer);
    }
}
