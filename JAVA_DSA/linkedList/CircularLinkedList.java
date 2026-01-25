public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
            if(temp == head) break;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        tail.next = head;
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        tail.next = head;
        size++;
    }
    void insert(int idx, int val) throws Error{
        if(idx == 0) insertAtHead(val);
        else if(idx == size) insertAtTail(val);
        else if(idx < 0 || idx > size) throw new Error("Invalid Index!");
        else{
            Node temp = new Node(val);
            Node x = head;
            for(int i = 1; i < idx; i++){
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
    }
    void deleteAtHead() throws Error{
        if(head == null) throw new Error("List is Empty");
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
    }
    void deleteAtTail() throws Error{
        if(head == null) throw new Error("List is Empty");
        if(tail == head) deleteAtHead();
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            size--;
        }
    }
    void delete(int idx) throws Error{
        if(idx < 0 || idx >= size) throw new Error("Invalid Index!");
        if(idx == 0) deleteAtHead();
        else if(idx == size - 1) deleteAtTail();
        else{
            Node temp = head;
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.display();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.display();

        list.insert(0, 900);
        list.display();

        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.delete(0);
        list.display();



        System.out.println("Size = "+list.size);
    }
}
