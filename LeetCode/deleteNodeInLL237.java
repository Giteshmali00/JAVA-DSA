package LeetCode;

class LinkedList {
    Node head;
    Node tail;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }

        tail.next = temp;
        tail = temp;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

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
