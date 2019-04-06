package cn.test;

/**
 * @Author: Nancy
 * @Date: 2019/4/4 16:09
 */
public class Test {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln1 = l1,ln2 = l2;
        ListNode head = null, temp = null;
        temp = head = new ListNode(0);
        int carry = 0;
        int sum = 0;
        int s = 0;
        while (ln1 != null || ln2 != null || carry != 0) {
            sum = (ln1 != null ? ln1.val:0) + (ln2 != null ? ln2.val: 0) + carry;
            carry = sum / 10;
            s = sum % 10;
            temp.next = new ListNode(s);
            temp = temp.next;
            ln1 = ln1 != null ? ln1.next:null;
            ln2 = ln2 != null ? ln2.next:null;
        }
        return head.next;

    }
}
