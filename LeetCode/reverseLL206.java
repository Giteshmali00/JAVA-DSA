public class reverseLL206 {
    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(6);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(2);

        list.display();
        list.head = reverseList(list.head);
        list.display();
    }
}
