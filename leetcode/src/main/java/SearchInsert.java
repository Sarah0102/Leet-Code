import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] > target){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == target)
                return 0;
            else
                return 1;
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }

            if((i+1) < nums.length && nums[i]< target && nums[i+1] > target){
                return i+1;
            }
        }
        return nums.length;
    }
}
