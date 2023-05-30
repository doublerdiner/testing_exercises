import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import unitTesting.Calculator;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testSum(){
        int expected = 8;
        int answer = calculator.sum(3,5);
        assertEquals(expected, answer);
    }

    @Test
    public void testSubtract(){
        int expected = 3;
        int answer = calculator.subtract(9,6);
        assertEquals(expected, answer);
    }

    @Test
    public void testMultiply(){
        int expected = 12;
        int answer = calculator.multiply(4,3);
        assertEquals(expected, answer);
    }

    @Test
    public void testDivide(){
        int expected = 2;
        int answer = calculator.divide(8,4);
        assertEquals(expected, answer);
    }

//    @ParameterizedTest
//    @ValueSource(ints = {2, -2, 200, -100000, 200000})
//    public void testIsEven(int number){
//        boolean answer = calculator.isEven(number);
//        assertTrue(answer);
//    }
    @Test
    public void testIsOdd(){
        boolean answer = calculator.isEven(5);
        assertFalse(answer);
    }

    @Test
    public void testIncrementsArray(){
        int[] expected = {5,6,7,8,9};
        int[] answer = calculator.incrementArray(new int[]{4,5,6,7,8});
        assertArrayEquals(expected, answer);
    }

    @Test
    public void testDivideByZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expected = "Ints cannot be divided by zero";
        String answer = exception.getMessage();
        assertEquals(answer, expected);
    }

}
