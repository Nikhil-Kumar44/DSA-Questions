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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode dummy=new ListNode(110,head);
       ListNode curr=head;
       ListNode pre=dummy;
       while(curr!=null){
        while(curr.next!=null&&curr.val==curr.next.val){
                curr=curr.next;
        }
        if(pre.next==curr){   //no duplicates found
               pre=curr;
        }
        else{
            pre.next=curr.next;
        }
        curr=curr.next;
       }
       return dummy.next;
    }
}