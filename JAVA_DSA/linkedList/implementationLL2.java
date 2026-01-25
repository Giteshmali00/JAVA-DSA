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
