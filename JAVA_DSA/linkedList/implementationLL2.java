package JAVA_DSA.linkedList;

class LinkedList {
    Node head;
    Node tail;
    int size;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) throws Error {
        Node temp = new Node(val);
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        if (idx < 0 || idx > size) {
            throw new Error("Invalid Index!");
        }

        Node x = head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;

        size++;
    }

    int get(int idx) throws Error {
        if (idx == 0) {
            return head.val;
        }
        if (idx == size - 1) {
            return tail.val;
        }
        if (idx < 0 || idx >= size) {
            throw new Error("Invalid Index!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void deleteAtHead() {
        if (head == null)
            throw new Error("List is null!");
        head = head.next;
        size--;
    }

    void delete(int idx) {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx < 0 || idx >= size) {
            throw new Error("Invalid Index!");
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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

public class implementationLL2 {
    // Iterative
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Recursive
    public static void print2(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        print2(head.next);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(5);
        list.insertAtTail(50);
        list.display();

        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();

        list.insert(0, 34);
        list.insert(3, 80);
        list.display();

        int getIdx = list.get(4);
        System.out.println(getIdx);

        list.deleteAtHead();
        list.display();

        list.delete(0);
        list.display();

        System.out.println("Length of the List : " + list.size);
    }
}
