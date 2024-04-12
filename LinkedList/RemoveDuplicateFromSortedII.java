package LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:                          Example 2:
Input: head = [1,2,3,3,4,4,5]       Input: head = [1,1,1,2,3]
Output: [1,2,5]                     Output: [2,3]

Constraints:
The number of nodes in the list is in the range [0, 300]. || -100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/

public class RemoveDuplicateFromSortedII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            boolean isDuplicate = false;

            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

}
