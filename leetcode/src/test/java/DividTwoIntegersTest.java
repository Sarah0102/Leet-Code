import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DividTwoIntegersTest {
    @Test
    void TestMinDividN2(){
        DivideTwoIntegers dividTwoIntegers = new DivideTwoIntegers();
        assertEquals(1073741824,dividTwoIntegers.divide(-2147483648,-2));
    }
    @Test
    void TestMinDividP2(){
        DivideTwoIntegers dividTwoIntegers = new DivideTwoIntegers();
        assertEquals(-1073741824,dividTwoIntegers.divide(-2147483648,2));
    }
    @Test
    void TestMinDividN1(){
        DivideTwoIntegers dividTwoIntegers = new DivideTwoIntegers();
        assertEquals(2147483647,dividTwoIntegers.divide(-2147483648,-1));
    }

    @Test
    void TestMinDivisor(){
        DivideTwoIntegers dividTwoIntegers = new DivideTwoIntegers();
        assertEquals(0,dividTwoIntegers.divide(-1010369383,-2147483648));
    }
    @Test
    void TestMaxDivisor(){
        DivideTwoIntegers dividTwoIntegers = new DivideTwoIntegers();
        assertEquals(Integer.MAX_VALUE/3,dividTwoIntegers.divide(Integer.MAX_VALUE,3));
    }
}
