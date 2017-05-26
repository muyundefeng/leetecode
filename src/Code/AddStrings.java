package Code;

/**
 * Created by lisheng on 17-5-17.
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += num1.charAt(i--) - 48;
            if (j >= 0)
                sum += num2.charAt(j--) - 48;
            carry = sum / 10;
            sb.append(sum % 10 + "");
        }
        if (carry != 0) sb.append(1 + "");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "5";
        String b = "1235";
        System.out.println(addStrings(a, b));
    }
}
