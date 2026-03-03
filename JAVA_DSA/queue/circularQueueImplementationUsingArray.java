public class circularQueueImplementationUsingArray {
    public static class CQueue{
        private int[] arr = new int[5];
        private int n = arr.length;
        private int size = 0;
        private int front = -1;
        private int rear = -1;
        void add(int val)throws Error{
            if(size==n) throw new Error("Queue is Full!");
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }else if(rear < n-1){
                arr[++rear] = val;
            }
            else if(rear == n-1){
                rear = 0;
                arr[0] = val;
            }

            size++;
        }
        int poll() throws Error{
            if(size==0) throw new Error("Queue is Empty!");
            int x = arr[front];
            if(front == n-1) front = 0;
            else front++;
            size--;
            return x;
        }
        int peek()throws Error{
            if(size==0) throw new Error("Queue is Empty!");
            return arr[front];
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            int i = front;
            while(i != rear){
                System.out.print(arr[i]+" ");
                if(i == n-1) i = 0;
                else i++;
            }
            System.out.println(arr[i]+" ");
        }

        int size(){return size;}
    }
    static void main(String[] args) {
        CQueue q = new CQueue();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(7);
        q.display();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
//        q.poll();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
//        q.add(50);

        q.display();
        System.out.println("Size : "+q.size());
    }
}
