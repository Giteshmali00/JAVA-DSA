public class removeLLElements203 {
    public static Node removeElements(Node head, int val) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(6);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);

        list.display();
        
        list.head = removeElements(list.head, 6);
        list.display();
    }
}
