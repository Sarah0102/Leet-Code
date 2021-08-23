public class ToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'M') {
                result += 1000;
                i++;
            } else if (s.charAt(i) == 'D') {
                result += 500;
                i++;
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i+=2;
                }else if (i < s.length() - 1 && s.charAt(i + 1) == 'M'){
                    result += 900;
                    i+=2;
                }else {
                    result +=100;
                    i++;
                }
            } else if(s.charAt(i) == 'L'){
                result += 50;
                i++;
            }else if(s.charAt(i) == 'X'){
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i+=2;
                }else if (i < s.length() - 1 && s.charAt(i + 1) == 'C'){
                    result += 90;
                    i+=2;
                }else {
                    result +=10;
                    i++;
                }
            }else if(s.charAt(i) == 'V'){
                result += 5;
                i++;
            }else if(s.charAt(i) == 'I'){
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i+=2;
                }else if (i < s.length() - 1 && s.charAt(i + 1) == 'X'){
                    result += 9;
                    i+=2;
                }else {
                    result +=1;
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCDLXXVI"));
    }
}

