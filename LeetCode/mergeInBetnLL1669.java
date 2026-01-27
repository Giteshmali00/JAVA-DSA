public class mergeInBetnLL1669 {
    public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
        Node temp = list1;
        Node l2kaLast = list2;
        for(int i = 1; i < a; i++){
            temp = temp.next;
            if(l2kaLast.next != null) l2kaLast = l2kaLast.next;
        }
        Node temp2 = temp.next;
        for(int i = a; i < b; i++){
            temp2 = temp2.next;
            if(l2kaLast.next != null) l2kaLast = l2kaLast.next;
        }

        while(l2kaLast.next != null) l2kaLast = l2kaLast.next;

        temp.next = list2;
        l2kaLast.next = temp2.next;
        
        return list1;
    }

    public static void main(String[] args) {
        // 3 <= list1.length <= 104
        // 1 <= a <= b < list1.length - 1
        // 1 <= list2.length <= 104
        LinkedList list1 = new LinkedList();
        list1.insertAtTail(1);
        list1.insertAtTail(2);
        list1.insertAtTail(3);
        list1.insertAtTail(4);
        list1.insertAtTail(5);
        list1.insertAtTail(6);
        list1.insertAtTail(7);

        list1.display();

        LinkedList list2 = new LinkedList();
        list2.insertAtTail(10);
        list2.insertAtTail(20);
        list2.insertAtTail(30);

        list2.display();

        int a = 2;
        int b = 3;

        list1.head = mergeInBetween(list1.head, a, b, list2.head);

        list1.display();
    }

}
