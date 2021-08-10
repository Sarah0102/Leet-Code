import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, 3, 4, 3}, 7);
        System.out.println("result[0]= " + result[0] + " result[1]= " + result[1]);
    }
}
