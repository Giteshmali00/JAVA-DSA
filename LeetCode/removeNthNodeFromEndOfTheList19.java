package LeetCode;

public class removeNthNodeFromEndOfTheList19 {
    // Method 1 :-
    public static Node removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int cIdx = count - n;
        if (cIdx == 0) {
            head = head.next;
            return head;
        }
        temp = head;
        for (int i = 1; i < cIdx; i++)
            temp = temp.next;

        temp.next = temp.next.next;

        return head;
    }

    // Method 2 :- Better than Method 1
    public static Node removeNthFromEnd2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        // move slow and fast together until fast reches tail
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        list.display();
        list.head = removeNthFromEnd(list.head, 2);
        list.display();
        list.head = removeNthFromEnd2(list.head, 2);
        list.display();
    }
}
