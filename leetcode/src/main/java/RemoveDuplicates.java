import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int a = nums[0];
        int i = 1;
        int j = 1;
        while (i < nums.length) {
            if (a == nums[i]) {
                i++;
            } else {
                nums[j] = nums[i];
                a = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
