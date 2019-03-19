package cn.nancy;

public class AddTwo {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1,l2));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newlist = null;
        ListNode temp = newlist;
        int val = 0;
        while(l1.next != null || l2.next != null){
            val += l1.val +l2.val;
            if(val > 10){
                temp = new ListNode(0);
                val = 1;
            }else {
                temp = new ListNode(val);
                val = 0;
            }
            temp = temp.next;
        }
        return newlist;

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
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
