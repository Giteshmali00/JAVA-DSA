
public class mergeKSortedLL23 {
    //Function for merge Two sorted Lists Helping function for Method 2.
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
 
    //Method 1 :-
    public static Node mergeKLists(Node[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        if(n == 1) return lists[0];

        Node temp1 = lists[0];
        Node dummy = new Node(-1);
        for(int i = 1; i < n; i++){
            Node temp = dummy;
            Node temp2 = lists[i];

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

            temp1 = dummy.next;

        }
        return dummy.next;   
    }

    //Method 2 :- using Binary Search much much better than Method 1.
    public static Node mergeKLists2(Node[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        if(n == 1) return lists[0];

        int mid = n / 2;
        Node[] left = new Node[mid];
        Node[] right = new Node[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = lists[i];
        }

        for(int i = 0; i < n-mid; i++){
            right[i] = lists[mid + i];
        }
        return mergeTwoLists(mergeKLists2(left),mergeKLists2(right));
    }//
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.insertAtTail(2);
        list1.insertAtTail(5);
        list1.insertAtTail(8);
        list1.display();;

        list2.insertAtTail(1);
        list2.insertAtTail(4);
        list2.insertAtTail(7);
        list2.display();

        list3.insertAtTail(3);
        list3.insertAtTail(6);
        list3.insertAtTail(9);
        list3.display();

        Node[] lists = {list1.head, list2.head, list3.head};
        LinkedList ans = new LinkedList();

        // ans.head = mergeKLists(lists);
        // ans.display();

        ans.head = mergeKLists2(lists);
        ans.display();
    }
}
