package JAVA_DSA.linkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class practice {
    // Without Recursion
    // public static void print(Node head) {
    // Node temp = head;
    // while (temp != null) {
    // System.out.println(temp.val);
    // temp = temp.next;
    // }
    // }

    // Recursively
    public static void print(Node head) {
        if (head == null)
            return;
        System.out.println(head.val);
        print(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;

        print(a);

    }
}
