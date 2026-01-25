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

    void insert(int idx, int val) {
        Node temp = new Node(val);
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid Index!");
            return;
        }

        Node x = head;

        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;

        size++;
    }

    int get(int idx) throws Error {
        if (idx == size - 1)
            return tail.val;
        if (idx >= size) {
            throw new Error("Invalid Index!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    void set(int idx, int val) throws Error {
        if (idx == size - 1) {
            tail.val = val;
            return;
        }

        if (idx >= size) {
            throw new Error("Invalid Index!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        temp.val = val;
    }

    void deleteAtHead() throws Error {
        if (head == null) {
            throw new Error("List is Null");
        }
        head = head.next;
        size--;
    }

    void deleteAtIdx(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        if (idx < 0 || idx >= size)
            throw new Error("Invalid Index!");
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        if (temp.next == tail)
            tail = temp;
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

        list.insert(5, 78);
        list.display();

        System.out.println(list.get(3));
        list.set(2, 200);
        list.display();

        list.deleteAtHead();
        list.display();

        list.deleteAtIdx(3);
        list.display();

        System.out.println("Size of the Linked List : " + list.size);
    }
}
