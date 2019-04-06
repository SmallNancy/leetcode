package cn.leetCode;

/**
 * leetCode 02
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwo {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println(addTwoNumbers(l1,l2));

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        int sum = 0;      //原始和
        int carry =  0;   //进位
        int contain = 0;  //数值
        while(l1 != null || l2 != null || carry != 0) {
            sum = (l1 != null ? l1.val:0) +(l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            contain = sum % 10;
            head = head.next = new ListNode(contain);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

        }
        return temp.next;


    }

}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }

    @Override
    public String toString() {
        return "ListNode:" +
                "val=" + val +
                ", next=" + next ;
    }

}
