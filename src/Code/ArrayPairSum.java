package Code;

import java.util.Arrays;

/**
 * Created by lisheng on 17-5-26.
 */
public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2)
            sum += nums[i];
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 3, 2, 4, 5};
        System.out.println(arrayPairSum(a));
    }
}
