public class MaxContainer {
    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            max = Math.max(max, getContainer(height[i], height[j], j - i));
            if ((height[i] > height[j])) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    public static int getContainer(int i, int j, int bottom) {
        return bottom * Math.min(i, j);
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
