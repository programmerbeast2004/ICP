/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)
        {
            return;
        }
        ListNode mid=head,move=head;
        while(move.next!=null && move.next.next!=null)
        {
            mid=mid.next;
            move=move.next.next;
        }
        ListNode reverse=mid.next;
        mid.next=null;
        reverse=reverseList(reverse);
        ListNode merge=head;
        while(reverse!=null)
        {
            ListNode temp1=merge.next;
            ListNode temp2=reverse.next;
            merge.next=reverse;
            reverse.next=temp1;
            merge=temp1;
            reverse=temp2;
        }
        
    }
    private ListNode reverseList(ListNode h)
    {
        ListNode prev=null;
        while(h!=null)
        {
            ListNode nextnode=h.next;
            h.next=prev;
            prev=h;
            h=nextnode;
        }
        return prev;
    }
}