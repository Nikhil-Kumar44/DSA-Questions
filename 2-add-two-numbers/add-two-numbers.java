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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode t1=l1;
        ListNode t2=l2;
        int sum=0;
        int carry=0;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(t1!=null||t2!=null){
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            ListNode node=new ListNode(sum);
       temp.next=node;
       temp=temp.next;
       sum=0;
        }
           if(carry!=0){
            ListNode node=new ListNode(carry);
            temp.next=node;
           }
           return ans.next;
    }
}