//TODO:: space complexity needs to be improved 

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newList = new ListNode(0);
        ListNode newHead = newList;
        addNode(newList, head, val);
        return newHead.next;
        
    }
    public void addNode(ListNode newList, ListNode oldList, int val){
        if(oldList == null)
            return; 
        if(oldList.val != val){
            ListNode newNode = new ListNode(oldList.val);
            newList.next = newNode;
            newList = newList.next;
        }
        addNode(newList, oldList.next, val);
        return;   
    }
}
