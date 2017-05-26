package Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisheng on 17-5-15.
 */
public class FourSumCount {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sums = new HashMap<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if (sums.containsKey(sum)) {
                    sums.put(sum, sums.get(sum) + 1);
                } else {
                    sums.put(sum, 1);
                }
            }
        }
        for (int k = 0; k < A.length; k++) {
            for (int z = 0; z < C.length; z++) {
                int sum = -(C[k] + D[z]);
                if (sums.containsKey(sum)) {
                    count += sums.get(sum);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int A[] = {0, 1, -1};
        int B[] = {-1, 1, 0};
        int C[] = {0, 0, 1};
        int D[] = {-1, 1, 1};
        System.out.println(fourSumCount(A, B, C, D));
    }
}
