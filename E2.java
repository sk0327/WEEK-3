class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

       
        ListNode n = new ListNode(0);

        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // save next node

            // find position to insert
            ListNode prev = n;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return n.next;
    }
}
