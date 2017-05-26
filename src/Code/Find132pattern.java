package Code;

import java.util.*;

/**
 * Created by lisheng on 17-5-9.
 */
public class Find132pattern {

    public static boolean find132pattern(int[] nums) {
        for (int j = 0, min = Integer.MAX_VALUE; j < nums.length; j++) {
            min = Math.min(nums[j], min);
            if (min == nums[j]) continue;

            for (int k = nums.length - 1; k > j; k--) {
                if (min < nums[k] && nums[k] < nums[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2};
        System.out.println(find132pattern(a));
    }
}
