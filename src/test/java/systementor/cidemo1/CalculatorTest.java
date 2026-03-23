package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    private final int a = 1;
    private final int b = 2;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addShouldReturn3() {
        int result = calculator.add(a,b) + 1000;
        assertEquals(1007,result); //Issue 1
    }

    @Test
    void subtractShouldReturnNegative1() {
        int result = calculator.subtract(a,b);
        assertEquals(10,result); //Issue 2
    }

    @Test
    void multiplyShouldReturn2() {
        int result = calculator.multiply(a,0);
        assertEquals(0,result); //issue 3
    }


    @Test
    void divideShouldReturn0() {
        int result = calculator.divide(a,b);
        assertEquals(0, result); //Issue 4
    }


    @Test
    void divideByZeroThrowsError(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5,0));
    }



}
