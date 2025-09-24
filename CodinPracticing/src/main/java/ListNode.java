class ListNode {

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode(int i, ListNode listNode, ListNode listNode1, ListNode listNode2, ListNode listNode3) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy head (result will be dummy.next)
        ListNode cur = dummy;
        int carry = 0; // start with no carry

        // loop until both lists are exhausted and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            // take current values (or 0 if list is finished)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // add both digits + carry
            int sum = x + y + carry;

            // digit to store is ones place
            int digit = sum % 10;

            // carry to move forward is tens place
            carry = sum / 10;

            // append digit as new node
            cur.next = new ListNode(digit);
            cur = cur.next;

            // move l1 and l2 forward
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // skip dummy and return head
    }
}