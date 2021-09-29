import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetStringAndCounter {
    public String getStringAndCounter(String str) {
        if (str.isEmpty() || str.length() == 0) {
            return "";
        }
        char[] strChar = str.toCharArray();
        List<Character> result = new ArrayList<>();
        result.add(strChar[0]);
        int counter = 1;
        for (int i = 1; i < strChar.length; i++) {
            if (strChar[i] == result.get(result.size() - 1)) {
                counter++;
            } else {
                insertCounter(result,counter);
                result.add(strChar[i]);
                counter = 1;
            }

        }
        insertCounter(result,counter);
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public void insertCounter(List<Character> list, int counter) {
        for (char c : String.valueOf(counter).toCharArray()) {
            list.add(c);
        }
    }
}
