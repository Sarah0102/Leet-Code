public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;
        int remainder = 0;
        while (x != 0) {
            remainder = x % 10;
            x = x / 10;
            result = remainder + result*10;
        }
        if(result > Integer.MAX_VALUE || result< Integer.MIN_VALUE)
            return 0;
        return (int) result;

    }

    public static void main(String[] args) {
        System.out.println(reverse(3201));
    }

}
