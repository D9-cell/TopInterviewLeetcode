package LinkedList;

/*
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list.

Example 1:                                          Example 2:
Input: head = [1,2,3,4,5], left = 2, right = 4      Input: head = [5], left = 1, right = 1
Output: [1,4,3,2,5]                                 Output: [5]

Constraints:
The number of nodes in the list is n.
1 <= n <= 500   ||  -500 <= Node.val <= 500   ||    1 <= left <= right <= n

Follow up: Could you do it in one pass?
*/

public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);

        ListNode leftPre = dummy;
        ListNode curNode = head;

        for (int i = 0; i < left-1; i++) {
            leftPre = leftPre.next;
            curNode = curNode.next;
        }

        ListNode subListHead = curNode;
        ListNode preNode = null;

        for (int i = 0; i <= right-left ; i++) {
            ListNode nexNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nexNode;

        }

        leftPre.next = preNode;
        subListHead.next = curNode;


        return dummy.next;
    }


}
