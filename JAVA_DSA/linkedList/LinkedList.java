public class LinkedList {
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

