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
     private boolean helper(ListNode head,int k){
        int count=0;
        ListNode temp=head;
        while(temp!=null&&count<k){
             temp=temp.next;
             count++;
        }
       return count==k;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
          if(head==null) return null;
        if(helper(head,k)){
            ListNode prev=null;
            ListNode curr=head;
            ListNode nt=null;
            int count=k;
            while(curr!=null&&count!=0){
                nt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nt;
                count--;
            }
            if(nt!=null){
                head.next=reverseKGroup(nt,k);
            }
            return prev;
            
        }
        return head;
}
}