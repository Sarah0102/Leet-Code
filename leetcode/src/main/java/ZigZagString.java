import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ZigZagString {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int numCols = getColumns(s.length(), numRows);
        char[] result = new char[s.length()];
        char[][] chars = new char[numRows][numCols];
        for (int i = 0; i < s.length(); i++) {
            int positionY;
            int positionX;
            char c = s.charAt(i);
            positionY = getColumns(i + 1, numRows) - 1;
            positionX = getRows(i + 1, numRows);
            chars[positionX][positionY] = c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (Character.valueOf(chars[i][j]) != '\0') {
                    sb.append(chars[i][j]);
                }
            }
        }
        return sb.toString();

    }

    public static int getColumns(int length, int numRows) {
        if (numRows == 1) {
            return length;
        }
        int numsCols = 0;
        int pattens = length / (2 * numRows - 2);
        numsCols += pattens * (numRows - 1);
        int left = length % (2 * numRows - 2);
        if (left >= numRows) {
            numsCols++;
            numsCols += left - numRows;
        } else if (left > 0) {
            numsCols++;
        }
        return numsCols;
    }

    public static int getRows(int length, int numRows) {
        int left = length % (2 * numRows - 2);

        if (left > numRows) {
            //System.out.println(numRows-1-left + numRows);
            return numRows - 1 - left + numRows;
        } else if (left == 0) {
            return 1;
        } else {
            return left - 1;
        }

    }

    public static String convertStr(String s, int numRows) {
        if (s.length()<= numRows|| numRows== 1) {
            return s;
        }
        StringBuilder[] lists = new StringBuilder[numRows];
        for (int i = 0; i < s.length(); i++) {
            int rowindex = getRows(i + 1, numRows);
            if (lists[rowindex] == null) {
                lists[rowindex] = new StringBuilder(String.valueOf(s.charAt(i)));
            } else {
                lists[rowindex] = lists[rowindex].append(String.valueOf(s.charAt(i)));
            }

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lists.length; i++) {
            result.append(lists[i].toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {

        //System.out.println(getColumns(14, 4));
        //System.out.println(getRows(6, 5));
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convertStr("PAYPALISHIRING", 3));

    }
}
