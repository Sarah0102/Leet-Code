import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n == 1) {
            result.add("()");
        } else {
            List<String> temp = generateParenthesis(n - 1);
            for (String str : temp) {
                for (int i = 0; i < str.length(); i++) {
                    StringBuilder insertedSB = new StringBuilder(str);
                    insertedSB.insert(i, "()");
                    if (!result.contains(insertedSB.toString())) {
                        result.add(insertedSB.toString());
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3).toString());
    }
}
