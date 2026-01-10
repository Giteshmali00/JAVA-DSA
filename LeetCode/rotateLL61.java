
public class rotateLL61 {
    // Method 2 :- slow & fast pointers.
    public static Node rotateRight2(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        k %= n;
        if (k == 0)
            return head;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    // Method 1 :- slightly better than method 1.
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        Node tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        k = k % n;
        if (k == 0)
            return head;
        Node newTail = head;
        for (int i = 1; i < n - k; i++) {
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        tail.next = head;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(6);

        list.display();
        list.head = rotateRight(list.head, 2);
        list.display();

        list.head = rotateRight2(list.head, 2);
        list.display();
    }
}
