public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (0 == dividend)
            return 0;
        if (1 == divisor)
            return dividend;
        if (-1 == divisor) {
            if (Integer.MIN_VALUE == dividend)
                return Integer.MAX_VALUE;
            else return -dividend;
        }
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        if (Integer.MIN_VALUE == dividend) {
            if (isNegative)
                return -getQuotient(dividend, -divisor,false);
            else
                return getQuotient(dividend, divisor,false);
        }
        if(Integer.MIN_VALUE == divisor){
            return 0;
        }

        int quotient = getQuotient(Math.abs(dividend), Math.abs(divisor),true);
        return isNegative ? -quotient : quotient;

    }

    public int getQuotient(int divid, int divs,boolean flag) {
        int quotient = 0;

        while (flag? divid>= divs: divid<= divs) {
            quotient++;
            divid = divid - divs;

        }
        return quotient;
    }

}
