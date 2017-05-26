package Code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisheng on 17-5-9.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int length = nums.length;
        int array[] = new int[2];
        array[0] = -1;
        array[1] = -1;
        for (int i = 0; i < length; i++) {
            int b = target - nums[i];
            list.set(i, Integer.MAX_VALUE);
            if (list.contains(b)) {
                int a = list.indexOf(b);
                array[0] = i;
                array[1] = a;
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {3, 3};
        int target = 6;
        int a1[] = twoSum(a, target);
        for (int b : a1)
            System.out.println(b);
    }

}
