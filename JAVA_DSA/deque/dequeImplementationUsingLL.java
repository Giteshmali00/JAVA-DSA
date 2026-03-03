public class dequeImplementationUsingLL {
    public static class DNode{
        int val;
        DNode next;
        DNode prev;
        DNode(int val){
            this.val = val;
        }
    }
    public static class LLDeque{
        private int size = 0;
        private DNode front;
        private DNode rear;

        void addLast(int val){
            DNode temp = new DNode(val);
            if(size==0){
                front = rear = temp;
            }else{
                temp.prev = rear;
                rear.next = temp;
                rear = temp;
            }
            size++;
        }
        void addFirst(int val){
            DNode temp = new DNode(val);
            if(size==0){
                front = rear = temp;
            }else{
                temp.next = front;
                front.prev = temp;
                front = temp;
            }
            size++;
        }
        void removeFirst()throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            front = front.next;
            front.prev = null;
            size--;
        }
        void removeLast()throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            rear = rear.prev;
            rear.next = null;
            size--;
        }
        int getFirst()throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            return front.val;
        }
        int getLast()throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            return rear.val;
        }
        void removeAll(){
            front = rear = null;
            size = 0;
        }
        void removeFirstOccurrence(int val) throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            if(front.val==val){
                removeFirst();
                return;
            }
            DNode temp = front;
            while(temp.next != null){
                if(temp.val == val){
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    size--;
                    return;
                }
                temp = temp.next;
            }
            if(rear.val==val) removeLast();
        }
        void removeLastOccurrence(int val) throws Error{
            if(size==0) throw new Error("DQueue is Empty!");
            if(rear.val==val){
                removeLast();
                return;
            }
            DNode temp = rear;
            while(temp.prev != null){
                if(temp.val == val){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    size--;
                    return;
                }
                temp = temp.prev;
            }
            if(front.val==val) removeFirst();
        }
        int size(){return size;}
        void display(){
            if(size==0){
                System.out.println("DQueue is Empty!");
                return;
            }
            DNode temp = front;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRev(){
            if(size==0){
                System.out.println("DQueue is Empty!");
                return;
            }
            DNode temp = rear;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        LLDeque dq = new LLDeque();
        dq.addFirst(3);
        System.out.println("\naddFirst()");
        dq.display();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println("\naddLast() *3");
        dq.display();
        dq.addFirst(4);
        dq.addFirst(3);
        System.out.println("\naddFirst() *2");
        dq.display();
        dq.removeFirstOccurrence(3);
        System.out.println("\nremoveFirstOccurrence(3)");
        dq.display();
        dq.removeLastOccurrence(4);
        System.out.println("\nremoveLastOccurrence(4)");
        dq.display();
        System.out.println("\ngetFirst() : "+dq.getFirst());
        System.out.println("\ngetLast() : "+dq.getLast());
        System.out.println("\ndisplayRev()");
        dq.displayRev();
        System.out.println("\nremoveAll()");
        dq.removeAll();
        dq.display();

        System.out.println("\nSize : "+dq.size());
    }
}
