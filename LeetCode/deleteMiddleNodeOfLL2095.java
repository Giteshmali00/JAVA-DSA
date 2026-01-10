
public class deleteMiddleNodeOfLL2095 {
    // Method 1 :-
    public static Node deleteMiddle(Node head) {
        Node temp = head;
        int n = 0;// size of the Linked List
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        if (n == 1)
            return null;
        temp = head;
        for (int i = 0; i < n / 2 - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;

    }

    // Method 2 :- Slightly better than Method 1
    public static Node deleteMiddle2(Node head) {
        if (head.next == null)
            return null;// edge case
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(4);
        list.insertAtTail(3);
        list.insertAtTail(8);
        list.insertAtTail(6);

        list.display();
        list.head = deleteMiddle(list.head);
        list.display();

        list.head = deleteMiddle2(list.head);
        list.display();
    }
}
