import java.util.Arrays;

public class Twosum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(Sum(nums, target)));
    }

    static int[] Sum (int[] arr, int target){
        if (arr.length == 0){
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }

            }
        }
        return arr;
    }
}