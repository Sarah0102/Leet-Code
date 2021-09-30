public class SearchInRotatedSortedArray {
    public int getIndex(int[] nums, int target) {
        if (nums[0] <= target) {
            int i = 0;
            do {
                if (nums[i] == target)
                    return i;
                i++;
            } while ( (i + 1 < nums.length)&&(nums[i] < nums[i + 1]) );
            if (i< nums.length && nums[i] == target)
                return i;
        } else if (nums[nums.length - 1] >= target) {
            int i = nums.length - 1;
            do {
                if (nums[i] == target)
                    return i;
                i--;
            } while ((i - 1 >= 0) && (nums[i] > nums[i - 1]));

            if (i>= 0 && nums[i] == target)
                return i;
        }
        return -1;
    }
}
