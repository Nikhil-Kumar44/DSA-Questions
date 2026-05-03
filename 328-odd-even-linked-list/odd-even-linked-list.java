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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode temp=head;
        ListNode ans=dummy;
        int counter=1;
        while(temp!=null){
            if(counter%2==1){
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            counter++;
            temp=temp.next;
        }
        temp=head;
        counter=1;
        while(temp!=null){
            if(counter%2==0){
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            counter++;
            temp=temp.next;
        }
        return ans.next;
    }
}