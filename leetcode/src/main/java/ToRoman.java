import java.io.CharConversionException;
import java.util.*;
import java.util.stream.Collectors;

public class ToRoman {
    public static String intToRoman(int num) {
        Map<Integer, Character> romanMap = new HashMap<>();
        romanMap.put(1, 'I');
        romanMap.put(5, 'V');
        romanMap.put(10, 'X');
        romanMap.put(50, 'L');
        romanMap.put(100, 'C');
        romanMap.put(500, 'D');
        romanMap.put(1000, 'M');
        List<Integer> keys = Arrays.asList(1000,500,100,50,10,5,1);
        StringBuilder result = new StringBuilder();
        int count = 0;
        int tempNum = num;
        for (int i = 0; i < keys.size(); i++) {
            if (4 == tempNum) {
                result.append('I');
                result.append('V');
                tempNum = tempNum - 4;
            } else if (9 == tempNum) {
                result.append('I');
                result.append('X');
                tempNum = tempNum - 9;
            } else if (tempNum >= 40 && tempNum <= 49) {
                result.append('X');
                result.append('L');
                tempNum = tempNum - 40;
            } else if (tempNum >= 90 && tempNum <= 99) {
                result.append('X');
                result.append('C');
                tempNum = tempNum - 90;
            } else if (tempNum >= 400 && tempNum <= 499) {
                result.append('C');
                result.append('D');
                tempNum = tempNum - 400;
            } else if (tempNum >= 900 && tempNum <= 999) {
                result.append('C');
                result.append('M');
                tempNum = tempNum - 900;
            } else {
                count = tempNum / keys.get(i);
                tempNum = tempNum % keys.get(i);
                if (count > 0) {
                    for (int j = 1; j <= count; j++) {
                        result.append(romanMap.get(keys.get(i)));
                    }
                }
            }
            if (0 == tempNum)
                break;

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

}
