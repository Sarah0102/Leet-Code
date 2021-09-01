import java.util.Arrays;

public class ArraySwap {
    public static void swap(int[] arr, int i, int j){
        int sum = arr[i]+ arr[j];
        arr[i] = sum - arr[i];
        arr[j] = sum - arr[i];
    }

    public static void main(String[] args) {
        int[] arr= {3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
