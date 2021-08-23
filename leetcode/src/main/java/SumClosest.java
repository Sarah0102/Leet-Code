import java.util.Arrays;

public class SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] + nums[2] >= target) {
            return nums[0] + nums[1] + nums[2];
        } else if (nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] <= target) {
            return nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        }
        int minidiff = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int currentDiff = nums[i] + nums[j] + nums[k] - target;
                if (currentDiff == 0) {
                    return target;
                } else if (currentDiff > 0) {
                    if (minidiff == 0) {
                        minidiff = currentDiff;
                    }
                    if (currentDiff < Math.abs(minidiff)) {
                        minidiff = currentDiff;
                    }
                    k--;
                } else {
                    if (minidiff == 0) {
                        minidiff = currentDiff;
                    }
                    if(Math.abs(currentDiff) < Math.abs(minidiff)){
                        minidiff = currentDiff;
                    }
                    j++;
                }
            }
        }
        return target + minidiff;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }
}
