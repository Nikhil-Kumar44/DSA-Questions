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
    public ListNode partition(ListNode head, int x) {
         ArrayList<Integer> nums = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            nums.add(temp.val);
            temp = temp.next;
        }

        // 👉 NEW: result list (instead of in-place swapping)
        ArrayList<Integer> result = new ArrayList<>();

        // first add < x
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < x) {
                result.add(nums.get(i));
            }
        }

        // then add >= x
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= x) {
                result.add(nums.get(i));
            }
        }

        // rebuild linked list
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        for (int i = 0; i < result.size(); i++) {
            dummy.next = new ListNode(result.get(i));
            dummy = dummy.next;
        }

        return ans.next;

    }
}