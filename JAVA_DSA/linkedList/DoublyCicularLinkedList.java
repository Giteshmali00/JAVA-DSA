public class DoublyCicularLinkedList {
    dNode head;
    dNode tail;
    int size;

    void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
            if(temp == head) break;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        head.prev = tail;
        tail.next = head;
        size++;
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        tail.next = head;
        head.prev = tail;
        size++;
    }
    public static void main(String[] args) {
        DoublyCicularLinkedList list = new DoublyCicularLinkedList();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.display();

        list.insertAtTail(7);
        list.insertAtTail(4);
        list.insertAtTail(8);
        list.display();


        System.out.println("Size = "+list.size);
    }
}
