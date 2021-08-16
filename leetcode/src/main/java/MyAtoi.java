import java.math.BigInteger;

public class MyAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        Character c = s.charAt(0);
        int result = 0;
        int tempMax = Integer.MAX_VALUE / 10;
        int mark = 7;
        int tempResult = Integer.MAX_VALUE;

        boolean flag;
        if (isNumber(c) ) {
            flag = true;
            result = Integer.valueOf(c.toString());
        } else if ('+' == c) {
            flag =true;
        } else if ('-' == c) {
            flag = false;
        } else {
            return 0;
        }
        if (!flag) {
            mark = 8;
            tempResult = Integer.MIN_VALUE;
        }
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                if (result < tempMax)
                    result = result * 10 + Integer.valueOf(c.toString());
                else if (result == tempMax && Integer.valueOf(c.toString()) <= mark)
                    result = result * 10 + Integer.valueOf(c.toString());
                else
                    return tempResult;
            } else {
                break;
            }
        }
        if (flag)
            return result;
        else
            return 0 - result;
    }

    public static boolean isNumber(char c) {
        if (c > '9' || c < '0')
            return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println(myAtoi("42"));

    }

}
