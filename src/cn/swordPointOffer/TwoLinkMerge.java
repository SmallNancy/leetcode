package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 16:32
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class TwoLinkMerge {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        System.out.printf(Merge(list1,list2).toString());


    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode newList = new ListNode(-1);
        ListNode temp = newList;
        if (temp1 == null)
            return temp2;
        if (temp2 == null)
            return temp1;

        while (temp1 != null && temp2 != null){
            if (temp1.val > temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
            }else{
                temp.next = temp1;
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
        if(temp1 != null){
            temp.next=temp1;
        }else{
            temp.next=temp2;
        }
        return newList.next;
    }
}

