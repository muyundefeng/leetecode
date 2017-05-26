package Code;

/**或许解决该题目使用等差数列代码更简洁
 * Created by lisheng on 17-5-26.
 */
public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        if (n == 0) return 0;
        int row = 1;
        while (true) {
            n = n - row;
            if (n > row)
                row++;
            else
                break;
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
}
