package Code;

import java.util.*;

/**
 * Created by lisheng on 17-5-15.
 */
public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int sum = 0;
        List<List<Integer>> lists = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int cIndex = 0;
                int dIndex = length - 1;
                while (true) {
                    if (i != j && cIndex != dIndex && i != dIndex && cIndex != i && j != cIndex && j != dIndex) {
                        sum = nums[i] + nums[j] + nums[cIndex] + nums[dIndex];
                        if (sum > target) {
                            dIndex--;
                        } else if (sum < target) {
                            cIndex++;
                        } else {
                            int array[] = {nums[i], nums[j], nums[cIndex], nums[dIndex]};
                            Arrays.sort(array);
                            String str = "";
                            List<Integer> integerList = new ArrayList<>();
                            for (Integer integers : array) {
                                str += integers;
                                integerList.add(integers);
                            }
                            if (set.add(str)) {
                                lists.add(integerList);
                            }
                            cIndex++;
                            dIndex--;
                            //break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int a[] = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(a, target));
    }
}
