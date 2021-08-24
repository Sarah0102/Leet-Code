import java.util.*;

public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> numberMap = new HashMap<>();
        numberMap.put(2, Arrays.asList("a", "b", "c"));
        numberMap.put(3, Arrays.asList("d", "e", "f"));
        numberMap.put(4, Arrays.asList("g", "h", "i"));
        numberMap.put(5, Arrays.asList("j", "k", "l"));
        numberMap.put(6, Arrays.asList("m", "n", "o"));
        numberMap.put(7, Arrays.asList("p", "q", "r", "s"));
        numberMap.put(8, Arrays.asList("t", "u", "v"));
        numberMap.put(9, Arrays.asList("w", "x", "y", "z"));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            result = combine(result, numberMap.get(num));
        }
        return result;
    }

    public static List<String> combine(List<String> strList1, List<String> strList2) {
        if (strList1.isEmpty()) {
            return strList2;
        }
        List<String> result = new ArrayList<>();
        for (String str1 : strList1) {
            for (String str2 : strList2) {
                result.add(str1.concat(str2));
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String digit = "2";
        System.out.println(letterCombinations(digit));
    }
}
