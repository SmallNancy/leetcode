package cn.leetCode.链表;

public class ReverseLink {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        //head.next.next.next = new ListNode(8);
        ListNode newNode =  reverseList(head);
        System.out.println(newNode.toString());
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = head;
        ListNode prior = null;
        while(newNode != null && newNode.next != null) {
            ListNode temp = newNode.next;
            newNode.next = prior;
            prior = newNode;
            newNode = temp;
        }
        newNode.next = prior;
        return newNode;

    }
}
