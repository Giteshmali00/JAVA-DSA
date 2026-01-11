
public class mergeTwoSortedLL21 {
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = list1;
        Node temp2 = list2;

        
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;

        return dummy.next;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(3);
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(9);
        list.insertAtTail(11);

        LinkedList list2 = new LinkedList();
        list2.insertAtTail(1);
        list2.insertAtTail(2);
        list2.insertAtTail(8);
        list2.insertAtTail(10);

        list.display();
        list2.display();
        
        LinkedList ans = new LinkedList();

        ans.head = mergeTwoLists(list.head, list2.head);

        
        ans.display();
    }
}
