public class reverseNodesInKGroups25 {
    public static Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;
        Node temp = head;
        Node nava = head;
        Node Next = null;
        Node con = null;

        while(temp != null){
            con = temp;
            for(int i = 0; i < k && temp != null; i++){
                if(i == k-1){
                    nava = temp.next;
                    for(int j = 0; j < k; j++){
                        Next = con.next;
                        con.next = nava;
                        nava = con;
                        con = Next;
                    }
                    curr.next = temp;
                    temp = head;
                    curr = head;
                    head = head.next;
                }
                if(temp != null) temp = temp.next;
            }
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

        list.head = reverseKGroup(list.head, 2);
        list.display();
    }
}
