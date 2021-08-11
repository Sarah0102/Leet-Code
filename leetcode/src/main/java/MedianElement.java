import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MedianElement {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = mergeArr(nums1,nums2);
        System.out.println("length is " + nums.length);
        if (nums.length % 2 == 0) {
            System.out.println("num1 is " + nums[nums.length / 2]);
            System.out.println("num2 is " + nums[nums.length / 2 - 1]);
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2d;
        }
        return nums[nums.length / 2];

    }

    public static int[] mergeArr(int[] nums1, int[] nums2) {
        if (nums1 == null) {
            return nums2;
        }
        if (nums2 == null) {
            return nums1;
        }
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;
        int index2 = 0;
        int index1 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                nums[index] = nums1[index1];
                index++;
                index1++;
            } else if (nums1[index1] == nums2[index2]) {
                nums[index] = nums1[index1];
                nums[++index] = nums2[index2];
                index2++;
                index++;
                index1++;
            } else {
                nums[index] = nums2[index2];
                index++;
                index2++;
            }
        }
        if(index1 < nums1.length){
            for(int i = index1; i< nums1.length;i++){
                nums[index++] = nums1[i];
            }
        }
        if(index2 < nums2.length){
            for (int i = index2;i< nums2.length;i++){
                nums[index++] = nums2[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        System.out.println(Arrays.toString(mergeArr(nums1,nums2)));
        System.out.println(Arrays.toString(mergeArr(nums1,nums2)));
    }

}
