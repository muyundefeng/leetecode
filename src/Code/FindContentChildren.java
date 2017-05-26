package Code;

import java.util.Arrays;

/**
 * Created by lisheng on 17-5-26.
 */
public class FindContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int indexg = 0, indexs = 0, count = 0;
        while (indexg < g.length && indexs < s.length) {
            if (s[indexs] >= g[indexg]) {
                count++;
                indexg++;
                indexs++;
            } else if (s[indexs] < g[indexg]) {
                indexs++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1, 2};
        int b[] = {1, 2, 3};
        System.out.println(findContentChildren(a, b));

    }
}
