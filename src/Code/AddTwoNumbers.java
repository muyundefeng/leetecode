package Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lisheng on 17-5-17.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> integerList1 = new ArrayList<Integer>();
        List<Integer> integerList2 = new ArrayList<Integer>();
        while (l1 != null) {
            integerList1.add(l1.val);
            l1 = l1.next;

        }
        while (l2 != null) {
            integerList2.add(l2.val);
            l2 = l2.next;
        }
        ListNode root = new ListNode(-1);
        ListNode temNode = root;
        List<Integer> myList = new ArrayList<>();
        List<Integer> tmp = integerList1.size() > integerList2.size() ? integerList1 : integerList2;
        int size = integerList1.size() < integerList2.size() ? integerList1.size() : integerList2.size();
        Collections.reverse(integerList1);
        Collections.reverse(integerList2);
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int sum = integerList1.get(i) + integerList2.get(i) + carry;
            myList.add(sum % 10);
            carry = sum / 10;
        }
        for (int i = size; i < tmp.size(); i++) {
            int sum = carry + tmp.get(i);
            myList.add(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            myList.add(carry);
        Collections.reverse(myList);
        for (Integer integer : myList) {
            ListNode node = new ListNode(integer);
            temNode.next = node;
            temNode = node;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(7);
//        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(4);
//        ListNode node3 = new ListNode(3);
//        node0.next = node1;
//        node1.next = node2;
//        node2.next = node3;

        ListNode node4 = new ListNode(5);
//        ListNode node5 = new ListNode(6);
//        ListNode node6 = new ListNode(4);
//        node4.next = node5;
//        node5.next = node6;

        ListNode node = addTwoNumbers(node0, node4);
        while (node != null) {
            System.out.println("value=" + node.val);
            node = node.next;
        }
    }
}
