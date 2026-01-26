public class flattenMultiLevelDoublyLL430{
    // Definition for a Node.
    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public void insertAtTail(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }
    }
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node child;

        Node(int val){
            this.val = val;
        }
    }
    //Method 1 :- Recursive method Space Complexity is good
    public static Node flatten(Node head) {
        Node temp = head;
        while(temp != null){
            Node n = temp.next;
            if(temp.child != null){
                Node c = flatten(temp.child);
                Node d = c;
                while(d.next != null) d = d.next;
                temp.next = c; c.prev = temp;
                d.next = n; 
                if(n != null) n.prev = d;
                temp.child = null;
            }
            temp = n;
        }
        return head;
    }
    //Method 2 :- Iterative method Time Complexity is good
    public static Node flatten2(Node head) {
        Node temp = head;
        while(temp != null){
            Node n = temp.next;
            if(temp.child != null){
                Node c = flatten(temp.child);
                Node d = c;
                while(d.next != null) d = d.next;
                temp.next = c; c.prev = temp;
                d.next = n; 
                if(n != null) n.prev = d;
                temp.child = null;
            }
            temp = n;
        }
        return head;
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

        LinkedList list1 = new LinkedList();
        list1.insertAtTail(7);
        list1.insertAtTail(8);
        list1.insertAtTail(9);
        list1.display();

        list.tail.prev.prev.child = list1.head;
        
        LinkedList list2 = new LinkedList();
        list2.insertAtTail(10);
        list2.insertAtTail(11);
        list2.display();

        list1.tail.prev.child = list2.head;

        list.head = flatten2(list.head);
        list.display();

    }
}