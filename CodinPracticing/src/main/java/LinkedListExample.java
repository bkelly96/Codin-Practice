class Node {
    int val;
    Node next;
    Node(int v) { val = v; }
}

public class LinkedListExample {
    // makes a reversed copy of the list
    static Node reverseCopy(Node head) {
        Node newHead = null;
        while (head != null) {
            Node n = new Node(head.val);
            n.next = newHead;
            newHead = n;
            head = head.next;
        }
        return newHead;
    }

    static void printList(Node head) {
        for (Node cur = head; cur != null; cur = cur.next)
            System.out.print(cur.val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // create original list: 1 → 2 → 3 → null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original: ");
        printList(head);

        Node reversed = reverseCopy(head);
        System.out.print("Reversed Copy: ");
        printList(reversed);
    }
}
