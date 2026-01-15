public class oddEvenLL328 {
    public static Node oddEvenList(Node head) {
        if(head == null || head.next == null) return head;
        Node a = head;
        Node b = head.next;
        Node dummy = head.next;

        while(b != null && b.next != null && a != null && a.next != null){
            a.next = b.next;
            a = a.next;
            b.next = a.next;
            b = b.next;
        }
        a.next = dummy;

        return head;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(2);
        list.insertAtTail(7);
        list.insertAtTail(4);
        list.insertAtTail(9);
        list.insertAtTail(6);

        list.display();
        list.head = oddEvenList(list.head);
        list.display();
    }
}
