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
    public ListNode rotateRight(ListNode head, int k) {
           if(head==null ||head.next==null || k==0) return head;
       
        ListNode slow=head;
        ListNode fast=head;
        int size=1;
        while(fast!=null&&fast.next!=null){   //finding length of ll
              fast=fast.next;
                size++;
        }
            int count = k%size;
        if(count==0) return head;
        fast=head;
        while(count!=0&&fast!=null){    //gap between slow and fast
              fast=fast.next;
              count--;   
        }
       
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;    // slow ->next points head of ll
        }
        ListNode temp=slow.next;
        slow.next=null;
        fast.next=head;
        head=temp;
        return head;
    }
}