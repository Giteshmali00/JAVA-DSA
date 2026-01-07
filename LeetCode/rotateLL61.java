package LeetCode;

public class rotateLL61 {
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        Node temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        k = k % size;
        if (k == 0)
            return head;

        Node rotate = head;
        for (int i = 1; i < size - k; i++) {
            rotate = rotate.next;
        }
        Node extra = rotate.next;
        temp.next = head;
        rotate.next = null;

        return extra;
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
    }
}
