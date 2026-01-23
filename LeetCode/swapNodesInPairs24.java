public class swapNodesInPairs24 {
    public static Node swapPairs(Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node t = dummy;
        Node temp = head;
        while(temp != null  && temp.next != null){
            Node c = temp.next.next;
            t.next = temp.next;
            t = t.next;
            t.next = temp;
            temp.next = c;
            t = t.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        list.display();
        list.head = swapPairs(list.head);
        list.display();
    }
}
