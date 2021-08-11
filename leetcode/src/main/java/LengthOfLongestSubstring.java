import java.util.*;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character,Integer> charMap = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            if (charMap.containsKey(s.charAt(end))) {
                start = Math.max(start, charMap.get(s.charAt(end)) +1);
            }
            charMap.put(s.charAt(end),end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;

    }


    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abbac"));

    }
}
