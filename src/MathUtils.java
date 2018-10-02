public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, int divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = (double)dividend / (double)divisor;
        // Cast both inputs to double instead of dividing ints THEN casting, to avoid rounding issues
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        // Initial result should be 1 such that if the exponent is 0, it will return 1,
        // else it will be modified properly.
        int res = 1;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            exp *= -1;
            isNegative = true;
        }

        /* Multiply the result by the base exp times
            Ex: base = 2, exp = 2
               --> res = 2, then res = 4 */
        for (int i = 0; i < exp; i++) {
           res *= base; 
        }

        /* If it's a negative exponent, we should invert it! */
        if (isNegative) {
            double dividedRes = divideNumbers(1, res);
            return dividedRes;
        }
        /* Otherwise, we are safe to just return the result */
        else {
            return res;
        }
    }    
}