import java.util.Locale;

public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        int result = -1;
        if(haystack.equals(needle) || needle.isEmpty()){
            return  0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int i = 0;
        while (i < haystack.length()) {
            if ( haystack.charAt(i) == needle.charAt(0)) {
                if(needle.length() + i <= haystack.length()) {
                    String str = haystack.substring(i, needle.length() + i);
                    if (str.equals(needle)) {
                        result = i;
                        break;
                    }
                }

            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
}
