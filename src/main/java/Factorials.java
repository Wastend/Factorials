import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The main class that calculates the sum of inverse factorials
 */
public class Factorials {
    /**
     *
     * @param N - the number of values of inverse factorials
     * @return returns the sum of the inverse factorials
     */
    public BigDecimal sumOfDivFact(int N){
        BigDecimal result = BigDecimal.ONE;
        for(int i=2; i<N+1; i++)
            result = result.add(factorial(i));
        return result;
    }

    /**
     *
     * @param i factorial
     * @return returns the inverse factorial
     */
    public BigDecimal factorial(int i){
        BigDecimal factor = BigDecimal.ONE;
        for(int j = 2; j<i+1; j++)
            factor = factor.multiply(BigDecimal.valueOf(j));
        return BigDecimal.ONE.divide(factor,10, RoundingMode.HALF_UP);
    }

}
