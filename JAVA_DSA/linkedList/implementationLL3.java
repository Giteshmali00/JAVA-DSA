class LL {
    Node head;
    Node tail;
    int size;

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

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
        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;

        size++;
    }
}

public class implementationLL3 {
    public static void main(String[] args) {
        LL list = new LL();
        list.display();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.display();

        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();

        list.insert(3, 50);
        list.display();

        System.out.println("length of the List : " + list.size);
    }
}
