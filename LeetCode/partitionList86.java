public class partitionList86 {
    public static Node partition(Node head, int x) {
        if(head == null || head.next == null) return head;
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node a = dummy1;
        Node b = dummy2;
        Node temp = head;

        while(temp != null){
            if(temp.val < x){
                a.next = temp;
                a = a.next;
            }else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        a.next = dummy2.next;
        b.next = null;

        return dummy1.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(2);
        list.insertAtTail(4);
        list.insertAtTail(1);
        list.insertAtTail(8);
        list.insertAtTail(6);

        list.display();
        list.head = partition(list.head, 3);
        list.display();
    }
}
