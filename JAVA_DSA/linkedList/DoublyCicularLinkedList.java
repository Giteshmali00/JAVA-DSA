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
    void insert(int idx, int val) throws Error{
        dNode temp = new dNode(val);
        if(idx < 0 || idx > size) throw new Error("Invalid Index");
        if(idx == 0) insertAtHead(val);
        else if(idx == size) insertAtTail(val);
        else{
            dNode x = head;
            for(int i = 1; i < idx; i++){
                x = x.next;
            }
            temp.next = x.next;
            temp.prev = x;
            x.next = temp;
            temp.next.prev = temp;
            size++;
        }
    }
    void deleteAtHead() throws Error{
        if(size==0) throw new Error("List is Empty");
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }
    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("List is Empty");
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }
    void delete(int idx) throws Error{
        if(idx < 0 || idx >= size) throw new Error("Invalid Index!");
        if(idx == 0) deleteAtHead();
        else if(idx == size-1) deleteAtTail();
        else{
            dNode temp = head;
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
    }
    void set(int idx, int val) throws Error{
        if(idx < 0 || idx >= size) throw new Error("Invalid Index!");
        if(idx == size-1) tail.val = val;
        else{
            dNode temp = head;
            for(int i = 0; i < idx; i++){
                temp = temp.next;
            }
            temp.val = val;
        }
    }
    int get(int idx) throws Error{
        if(idx < 0 || idx >= size) throw new Error("Invalid Index!");
        if(idx == size - 1) return tail.val;
        else{
            dNode temp = head;
            for(int i = 0; i < idx; i++){
                temp = temp.next;
            }
            return temp.val;
        }
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

        list.insert(3,50);
        list.display();

        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.delete(2);
        list.display();

        System.out.println(list.get(3));

        list.set(3,60);
        list.display();

        System.out.println("Size = "+list.size);
    }
}
