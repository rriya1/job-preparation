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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = new ListNode(-1, head);
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //slow points to middle: even length: actual middle, odd length: middle-1
        //reverse from middle

        ListNode reversed = null;

        while(slow!=null){
            ListNode tmp = slow;
            slow = slow.next;
            tmp.next = reversed;
            reversed = tmp;
        }

        boolean ans = true;

        while(head!=null && reversed!=null){
            if(head.val!=reversed.val)
                ans = false;
            head = head.next;
            reversed = reversed.next;
        }

        return ans;
    }
}
