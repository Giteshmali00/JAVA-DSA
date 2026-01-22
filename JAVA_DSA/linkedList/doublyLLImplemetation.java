class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val = val;
    }
}

class DoublyLinkedList{
    dNode head;
    dNode tail;
    int size = 0;

    void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0){
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;  
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx >= size) {
            insertAtTail(val);
            return;
        }
        else if(idx <= 0){
            insertAtHead(val);
            return;
        }
        dNode temp = new dNode(val);
        dNode travel = head;
        for(int i = 1; i < idx; i++){
            travel = travel.next;
        }
        temp.next = travel.next;
        temp.prev = travel;
        temp.next.prev = temp;
        travel.next = temp;
        size++;
    }
}
public class doublyLLImplemetation {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);

        list.display();

        list.insertAtHead(5);
        list.insertAtHead(4);
        list.insertAtHead(3);

        list.display();

        list.insert(2, 64);
        list.display();
        list.insert(0, 10);
        list.display();
        list.insert(7, 20);
        list.display();

        System.out.println(list.size);
    }
}
