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
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode start;
        ListNode cur1, cur2;

        if (list1.val <= list2.val) {
            start = list1;
            cur1 = list1.next;
            cur2 = list2;
        } else {
            start = list2;
            cur1 = list1;
            cur2 = list2.next;
        }

        ListNode prev = start;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                prev.next = cur1;
                prev = cur1;
                cur1 = cur1.next;
            } else {
                prev.next = cur2;
                prev = cur2;
                cur2 = cur2.next;
            }
        }

        prev.next = (cur1 != null) ? cur1 : cur2;
        return start;
    }
}
