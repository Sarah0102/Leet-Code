import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        char expected = getExpected(s.charAt(0));
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == expected && !list.isEmpty()) {
                list.remove(list.size() - 1);
                if(!list.isEmpty()) {
                    expected = getExpected(list.get(list.size() - 1));
                }
            } else {
                list.add(s.charAt(i));
                expected = getExpected(s.charAt(i));
            }
        }

        return list.isEmpty() ? true : false;
    }

    public static char getExpected(char c) {
        switch (c) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            default:
                return 'w';
        }
    }

    public static void main(String[] args) {
        String s ="{[]}";
        System.out.println(isValid(s));
    }
}
