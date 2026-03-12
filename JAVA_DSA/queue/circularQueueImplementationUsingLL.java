public class circularQueueImplementationUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLCQueue{
        int size = 0;
        Node front;
        Node rear;

        void add(int val){
            Node temp = new Node(val);
            if(size==0) front = rear = temp;
            else{
                rear.next = temp;
                rear = temp;
            }
            rear.next = front;
            size++;
        }
        int poll() throws Error{
            if(size==0) throw new Error("Queue is Empty!");
            int x = front.val;
            front = front.next;
            rear.next = front;
            return x;
        }
        int peek() throws Error{
            if(size==0) throw new Error("Queue is Empty!");
            return front.val;
        }
        void display(){
            if(size==0) {
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = front;
            do{
                System.out.print(temp.val+" ");
                temp = temp.next;
            }while(temp!=rear.next);

            System.out.println();
        }
        boolean isEmpty(){
            return size == 0;
        }
        int size(){return size;}
    }
    static void main(String[] args) {
        LLCQueue q = new LLCQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println("poll() : "+q.poll());
        q.display();
        System.out.println("peek() : "+q.peek());

        System.out.println("Size : "+q.size());
    }
}
