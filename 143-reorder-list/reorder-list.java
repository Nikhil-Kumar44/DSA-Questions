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
             if(head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
        ListNode pre=null;
        ListNode curr=slow.next;
        ListNode nxt=null;
        slow.next=null;
        while(curr!=null){
               nxt=curr.next;
               curr.next=pre;
               pre=curr;
               curr=nxt;
        }
       
       ListNode first=head;
       curr=pre;
        while(curr!=null){
            ListNode temp1=first.next;
            ListNode temp2=curr.next;
            first.next=curr;
            curr.next=temp1;
            first=temp1;
            curr=temp2;

        }
}
}