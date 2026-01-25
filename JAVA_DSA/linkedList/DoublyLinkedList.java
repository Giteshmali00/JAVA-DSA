public class DoublyLinkedList{
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
    void insert(int idx, int val) throws Error{
        if(idx == size) {
            insertAtTail(val);
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx <= 0 || idx > size) throw new Error("Invalid Index!");
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
    void deleteAtHead() throws Error{
        if(head == null) throw new Error("List is Empty");
        head = head.next;
        if(head != null) head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("List is Empty");
        tail = tail.prev;
        if(tail != null) tail.next = null;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
        if(idx >= size || idx < 0) throw new Error("Invalid Index");

        dNode temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp != null) temp.next.prev = temp;
        size--;
    }
    int get(int idx) throws Error{
        if(idx == 0) return head.val;
        if(idx == size-1) return tail.val;
        if(idx < 0 || idx >= size) throw new Error("Invalid Index!");

        dNode temp = head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val) throws Error{
        if(idx == 0) head.val = val;
        else if(idx == size - 1) tail.val = val;
        else if(idx < 0 || idx >= size) throw new Error("Invalid Index!");
        else{
            dNode temp = head;
            for(int i = 0; i < idx; i++){
                temp = temp.next;
            }
            temp.val = val;
        }
    }
}