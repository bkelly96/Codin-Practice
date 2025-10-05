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

//this will cut the length in half and reassign the head.
class ListNodeFindHalf {
    public static ListNode middleNode(ListNode head) {
        int length = sizeCheck(head);

        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        return head;
    }

    public static int sizeCheck(ListNode head) {
        int size = 0;
        ListNode n = head;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }

    public static void main(String[] args) {

        ListNode x = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        ListNode answer =  middleNode(x);
        System.out.println(answer.val);
    }
}
