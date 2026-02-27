public class circularQueueImplementationUsingArray {
    public static class CQueue{
        private int[] arr = new int[5];
        private int n = arr.length;
        private int size = 0;
        private int front = 0;
        private int rear = 0;
        void add(int val)throws Error{
            if(size==n) throw new Error("Queue is Full!");
            else if(rear==n-1) {
                arr[rear] = val;
                rear = 0;
            }else arr[rear++] = val;
            size++;
        }
        int poll() throws Error{
            if(size==0) throw new Error("Queue is Empty!");
            int x = arr[front];
            if(front==n-1) front = 0;
            else front++;
            size--;
            return x;
        }
        void display(){
            if(size==0) System.out.println("Queue is Empty!");
            for(int i = front; i < size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){return size;}
    }
    static void main(String[] args) {
        CQueue q = new CQueue();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(6);
        q.display();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.add(10);
        q.add(20);
        q.display();

        System.out.println("Size : "+q.size());
    }
}
