import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;


public class palindromic {
    public static String longestPalindrome(String s) {
        int endindex;
        String maxSubstring = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            endindex = s.lastIndexOf(s.charAt(i));
            if (endindex > i) {
                while (endindex > 0) {
                    String substr = s.substring(i, endindex + 1);
                    if (!isPalindromic(substr)) {
                        endindex = s.lastIndexOf(s.charAt(i), endindex - 1);
                        if (endindex > i)
                            continue;
                        else
                            break;
                    } else {
                        if (substr.length() > maxSubstring.length()) {
                            maxSubstring = substr;
                        }
                        break;
                    }
                }
            }
        }
        return maxSubstring;
    }

    public static Boolean isPalindromic(String s) {
        int start = 0;
        int end = s.length() - 1;
        Boolean result = true;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                result = false;
                break;
            }
            start++;
            end--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babadada"));
    }
}
