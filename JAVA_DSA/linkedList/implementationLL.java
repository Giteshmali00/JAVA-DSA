package JAVA_DSA.linkedList;

class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

}

public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        System.out.println("Size of the Linked List : " + list.size);

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.display();
        list.insertAtTail(34);
        list.display();

        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();

        System.out.println("Size of the Linked List : " + list.size);
    }
}
