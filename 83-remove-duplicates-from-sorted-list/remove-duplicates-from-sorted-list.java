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
         if(head==null||head.next==null)
        return head;
        ListNode first=head;
        ListNode sec=head.next;
        ListNode temp=head;
        while(sec!=null){
            if(first.val==sec.val){
                    temp=sec;
                    sec=sec.next;
                    temp.next=null;
                    first.next=sec;
                   
            }
            else{
            first=sec;
            sec=sec.next;
            }
        }
        return head;
    }
}