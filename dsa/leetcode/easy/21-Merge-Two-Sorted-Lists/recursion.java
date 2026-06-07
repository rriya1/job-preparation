/*
NOTES:
To get to the recursive approach, think about the choice/decision to make here.
you're picking which head to attach next, the one with the smaller value. 
Once you pick it, you move past it, so the remaining input naturally shrinks by one node each time.
*/

// time complexity: o(n+m) ; the number of times we are calling the function and each function call takes o(1)
// space complexity: o(n+m) ; the number of times the function stack is build i.e. the number of times the function was called here. 

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currptr = new ListNode(0);
        ListNode mergedHead = currptr;
        add(list1, list2, currptr);
        return mergedHead.next;
    }

    public void add(ListNode head1, ListNode head2, ListNode currptr){
        if( head1 == null){
            currptr.next = head2;
            return;
        }
        if( head2 == null){
            currptr.next = head1;
            return;
        }
        if( head1.val <= head2.val){
            currptr.next = head1;
            add(head1.next, head2, currptr.next); 
        }
        else{
            currptr.next = head2;
            add(head1, head2.next, currptr.next);
        }
        return;
    }
}
