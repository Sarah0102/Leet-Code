import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if (nums.length == 2) {
            swap(nums,0,1);
            System.out.println(Arrays.toString(nums));
        } else {
            int i = nums.length - 2;
            while (i >= 0) {
                if (nums[i] < nums[i + 1])
                    break;
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j > i) {
                    if (nums[j] > nums[i])
                        break;
                    j--;
                }
                swap(nums,i,j);
            }
            i++;
            int k=0;
            while (i+k < nums.length-k) {
                swap(nums,i+k,nums.length-1-k);
                k++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int sum = arr[i]+ arr[j];
        arr[i] = sum - arr[i];
        arr[j] = sum - arr[i];
    }
    public static void main(String[] args) {
        int[] nums = {5,6,4,3,0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
