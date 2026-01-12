public class sortLL148 {
    public static Node mergeTwoSortedLL(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node i = head1;
        Node j = head2;
        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                i = i.next;
            }else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }

        if(i == null) temp.next = j;
        else temp.next = i;

        return dummy.next;

    }
    public static Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;

        head = sort(head);
        head2 = sort(head2);
        
        return mergeTwoSortedLL(head,head2);
    }
    public static Node sortList(Node head) {
        if(head == null || head.next == null) return head;

        return sort(head);
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(3);
        list.insertAtTail(1);
        list.insertAtTail(5);
        list.insertAtTail(8);
        list.insertAtTail(4);
        list.insertAtTail(6);

        list.display();
        list.head = sortList(list.head);
        list.display();
    }
}
