package leetcode.median;

import leetcode.base.ListNode;

public class $02_AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;  //进位
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(carry != 0 || l1 != null || l2 != null){
            int val1 = l1 == null ? 0:l1.val;
            int val2 = l2 == null ? 0:l2.val;
            int res = carry + val1 + val2;
            carry = carry >= 10 ? 1 : 0;
            result.next = new ListNode(res % 10);
            result = result.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return head.next;
    }
}
