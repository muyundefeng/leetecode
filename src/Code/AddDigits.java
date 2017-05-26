package Code;

/**
 * Created by lisheng on 17-5-17.
 */
public class AddDigits {
    public static int addDigits(int num) {
        if (num < 10)
            return num;
        else {
            int sum = 0;
            String nums = num + "";
            for (int i = 0; i < nums.length(); i++) {
                sum += nums.charAt(i) - 48;
            }
            return addDigits(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(92));
    }
}
