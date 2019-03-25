package cn.swordPointOffer;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 16:24
 */
public class FindkToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size += 1;
            temp = temp.next;
        }
        if(k > size)
            return null;
        int index = size - k;
        temp = head;
        while(index >0){
            index--;
            temp = temp.next;
        }
        return temp;

    }
}


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return  "val=" + val +
                ", next=" + next;
    }
}