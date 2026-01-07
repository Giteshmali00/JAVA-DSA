package LeetCode;

public class deleteNodeInLL237 {

    // Main Logic
    public static void delete(Node n) {
        n.val = n.next.val;
        n.next = n.next.next;
    }
    //

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        list.display();

        delete(list.head.next.next);

        list.display();

    }
}
