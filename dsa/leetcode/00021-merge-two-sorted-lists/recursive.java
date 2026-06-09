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
