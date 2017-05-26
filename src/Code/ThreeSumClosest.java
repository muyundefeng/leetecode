package Code;

import java.util.Arrays;

/**
 * Created by lisheng on 17-5-15.
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int sum = 0;
        int suma = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int bIndex = 0, cIndex = length - 1;
            while (true) {
                if (bIndex != i && cIndex != i) {
                    sum = nums[bIndex] + nums[cIndex] + nums[i];
                    if (sum < target) {
                        bIndex++;
                        if (target - sum < diff) {
                            diff = Math.abs(target - sum);
                            suma = sum;
                        }
                    } else if (sum > target) {
                        cIndex--;
                        if (sum - target < diff) {
                            diff = Math.abs(target - sum);
                            suma = sum;
                        }
                    } else {
                        diff = 0;
                        suma = sum;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int array[] = {-1, 0, 1, 1, 55};
        int target = 3;
        System.out.println(threeSumClosest(array, target));
    }
}
