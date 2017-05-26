package Code;

import java.util.Collections;

/**
 * Created by lisheng on 17-5-24.
 */
class ListNode1 {
    int val;
    ListNode next;

    ListNode1(int x) {
        val = x;
    }
}

public class AddTwoNumbers2 {

    @SuppressWarnings("Duplicates")
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode root = new ListNode(-1);
        ListNode temp = root;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode addnode = new ListNode(sum % 10);
            temp.next = addnode;
            temp = addnode;
            carry = sum / 10;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return root.next;
    }
}
