package LeetCode;

public class removeDuplicatesFromSortedLL83 {
    public static Node deleteDuplicates(Node head) {
        if (head == null || head.next == null)
            return head;
        Node a = head;
        Node b = head;
        while (b != null) {
            if (a.val == b.val)
                b = b.next;
            else {
                a.next = b;
                a = b;
            }
        }
        a.next = null;

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(5);

        list.display();
        list.head = deleteDuplicates(list.head);
        list.display();
    }
}
