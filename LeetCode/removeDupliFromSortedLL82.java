public class removeDupliFromSortedLL82 {
    public static Node deleteDuplicates(Node head) {
        if(head == null) return null;
        Node dummy = new Node(-1);
        Node travel = dummy;
        Node temp = head.next;
        while(temp != null){
            if(head.val != temp.val){
                travel.next = head;
                travel = travel.next;
                head = head.next;
                temp = temp.next;
            }
            else{
                while(temp != null && head.val == temp.val){
                    temp = temp.next;
                }
                head = temp;
                if(temp != null)temp = temp.next;
            }
        }
        travel.next = head;
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(3);
        list.insertAtTail(3);
        list.insertAtTail(5);
        list.insertAtTail(5);
        list.insertAtTail(6);

        list.display();
        list.head = deleteDuplicates(list.head);
        list.display();
        
    }
}
