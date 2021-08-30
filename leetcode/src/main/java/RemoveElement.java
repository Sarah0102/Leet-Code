public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (val == nums[i]) {
                while (i < j && val == nums[j]) {
                    j--;
                }
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println(removeElement(arr, 1));
    }
}
