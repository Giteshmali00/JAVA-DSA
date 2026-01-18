public class reverseLLII92 {
    public static void reverseLR(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
    }
    
    //Method 1 :- 
    public static Node reverseBetween(Node head, int left, int right) {
        Node a = null, b = null, c = null, d = null;
        Node temp = head;
        int count = 1;
        while(temp != null){
            if(count == left -1) a = temp;
            if(count == left) b = temp;
            if(count == right) c = temp;
            if(count == right +1) d = temp;
            temp = temp.next;
            count++; 
        }
        if(c != null) c.next = null;
        reverseLR(b);
        if(a != null) a.next = c;
        if(b != null) b.next = d;

        if(left == 1) return c;

        return head;
    }
    //Method 2 :- 1 step better than Method 1
    public static Node reverseBetween2(Node head, int left, int right) {
        Node leftConnect = null;
        Node rightConnect = null;
        Node a = head, b = null;
        
        for(int i = 1; i < left; i++){
            if(i == left - 1) leftConnect = a;
            a = a.next;
        }
        b = a;
        for(int i = left; i < right; i++){
            b = b.next;
        }
        rightConnect = b.next;
        b.next = null;

        reverseLR(a);
        if(left == 1) {
            head = b;
        }else{
            leftConnect.next = b;
        }
        a.next = rightConnect;
        
        return head;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        list.display();
        list.head = reverseBetween(list.head, 2, 4);
        list.display();

        list.head = reverseBetween(list.head, 2, 4);
        list.display();
    }
}
