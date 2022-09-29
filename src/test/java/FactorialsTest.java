import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

/**
 * The class contains methods for testing methods Factorials.java
 */
public class FactorialsTest {
    /**
     * factorials - object of Factorials
     */
    Factorials factorials = new Factorials();
    @Test
    /**
     * factorialTest tests the factorial method in the class Factorials
     */
    public void factorialTest() {
        BigDecimal fac1 = new BigDecimal(0.0083333333);
        BigDecimal fac2 = new BigDecimal(0E-10);
        BigDecimal fac3 = new BigDecimal(0.1666666667);
        assertEquals(fac1.setScale(10, RoundingMode.HALF_UP), factorials.factorial(5));
        assertEquals(fac2.setScale(10, RoundingMode.HALF_UP), factorials.factorial(510));
        assertEquals(fac3.setScale(10, RoundingMode.HALF_UP), factorials.factorial(3));
    }

    /**
     * sum0fDivFactTest tests the sum0fDivFact method in the class Factorials
     */
    @Test
    public void sum0fDivFactTest() {
        BigDecimal fac1 = new BigDecimal(1.7166666667);
        BigDecimal fac2 = new BigDecimal(1.7182818286);
        BigDecimal fac3 = new BigDecimal(1.6666666667);
        assertEquals(fac1.setScale(10, RoundingMode.HALF_UP), factorials.sumOfDivFact(5));
        assertEquals(fac2.setScale(10, RoundingMode.HALF_UP), factorials.sumOfDivFact(510));
        assertEquals(fac3.setScale(10, RoundingMode.HALF_UP), factorials.sumOfDivFact(3));
    }
}