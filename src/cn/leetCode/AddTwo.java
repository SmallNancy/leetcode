package cn.leetCode;

/**
 * leetCode 01
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
        ListNode ln1 = l1,ln2 = l2,head = null,node = null;
        int carry = 0,contain = 0,sum = 0;
        head = node = new ListNode(0);
        while(ln1 != null || ln2 != null || carry != 0){
            sum = (ln1!= null ?ln1.val:0) + (ln2 != null ?ln2.val:0) + carry;
            carry = sum/10;
            contain = sum % 10;
            node = node.next = new ListNode(contain);
            ln1 = (ln1 != null ? ln1.next : null);
            ln2 = (ln2 != null ? ln2.next : null);
        }

        return  head.next;
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
