public class reorderLL143 {
    public static Node middleLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
    public static Node reverseLL(Node head){
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
    public static void reorderList(Node head) {
        Node rmidHead = reverseLL(middleLL(head));

        Node temp = head;
        while(rmidHead != null){
            Node mainNext = temp.next;
            Node conNode = rmidHead;
            rmidHead = rmidHead.next;
            temp.next = conNode;
            conNode.next = mainNext;
            temp = mainNext;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);

        list.display();
        reorderList(list.head);
        list.display();
    }
}
