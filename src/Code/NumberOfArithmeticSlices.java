package Code;

/**
 * Created by lisheng on 17-5-26.
 */
public class NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int length = A.length;
        if (length < 3)
            return 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j >= 2) {
                    if (validate(A, j, i))
                        count++;
                }
            }
        }
        return count;
    }

    public boolean validate(int[] A, int start, int end) {
        int difference = A[start + 1] - A[start];
        boolean flag = true;
        for (int i = start + 2; i <= end; i++) {
            if (A[i] == A[i - 1] + difference) {
                flag &= true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 7};
        NumberOfArithmeticSlices numberOfArithmeticSlices = new NumberOfArithmeticSlices();
        System.out.println(numberOfArithmeticSlices.numberOfArithmeticSlices(a));
    }
}
