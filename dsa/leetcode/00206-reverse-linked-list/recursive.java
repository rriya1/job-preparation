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
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next == null)
            return head;

        return reverse(null,head);
    }

    public ListNode reverse(ListNode output, ListNode input){
        if(input == null)
            return output;

        ListNode tmp = input;
        input = input.next;
        tmp.next = output;
        
        return reverse(tmp, input);
    }
}
