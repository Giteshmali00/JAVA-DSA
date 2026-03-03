import javax.crypto.spec.PSource;

public class dequeImplementationUsingArray {
    public static class DNode{
        int val;
        DNode next;
        DNode prev;
        DNode(int val){
            this.val = val;
        }
    }
    public static class ADeque{
        int[] arr = new int[5];
        int n = arr.length;
        int front = -1;
        int rear = -1;
        int size = 0;

        void addLast(int val) throws Error{
            if(size==n) throw new Error("Deque is Full!");
            if(size==0){
                front = rear = 0;
                arr[0] = val;
            }else if(rear == n-1){
                arr[0] = val;
                rear = 0;
            }
            else if(rear < n-1) arr[++rear] = val;
            size++;
        }
        void addFirst(int val) throws Error{
            if(size==n) throw new Error("Deque is Full!");
            if(size==0){
                front = rear = 0;
                arr[0] = val;
            }else if(front==0){
                arr[n-1] = val;
                front = n-1;
            }else if(front > 0) arr[--front] = val;
            size++;
        }
        void removeLast() throws Error{
            if(size==0) throw new Error("Deque is Empty!");
            if(rear == 0) rear = n-1;
            else if(rear > 0) rear--;
            size--;
        }
        void removeFirst() throws Error{
            if(size==0) throw new Error("Deque is Empty!");
            if(front == n-1) front = 0;
            else if(front < n-1) front++;
            size--;
        }
        int getFirst(){
            if(size==0) throw new Error("Deque is Empty!");
            return arr[front];
        }
        int getLast(){
            if(size==0) throw new Error("Deque is Empty!");
            return arr[rear];
        }
        void removeAll(){
            rear = front = -1;
            size = 0;
        }
        void display(){
            if(size==0){
                System.out.println("Deque is Empty!");
                return;
            }
            int i = front;
            while(i!=rear){
                System.out.print(arr[i]+" ");
                if(i<n-1)i++;
                else i = 0;
            }
            System.out.println(arr[i]+" ");
        }
        int size(){return size;}
    }
    static void main(String[] args) {
        ADeque dq = new ADeque();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.display();
        dq.removeLast();
        dq.display();
        dq.removeFirst();
        dq.display();
        dq.addFirst(6);
        dq.addLast(7);
        dq.display();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.removeAll();
        dq.display();

        System.out.println("Size : "+dq.size());
    }
}
