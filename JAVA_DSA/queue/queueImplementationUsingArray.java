public class queueImplementationUsingArray {
    public static class MyQueue{
        int[] arr = new int[50];
        int front = 0;
        int rear = 0;
        void add(int val) throws Error{
            if(rear>=arr.length) throw new Error("Queue is Full!");
            arr[rear] = val;
            rear++;
        }
        int poll() throws Error{
            if(rear==front) throw new Error("Queue is Empty!");
            front++;
            return arr[front-1];
        }
        int peek() throws Error{
            if(rear==front) throw new Error("Queue is Empty!");
            return arr[front];
        }
        void display() throws Error{
            if(front==rear) throw new Error("Queue is Empty!");
            for(int i = front; i < rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return rear-front;
        }
    }
    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println("Poll : "+q.poll());
        q.display();
        System.out.println("Peek : "+q.peek());
        q.poll();
        q.poll();
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        System.out.println("Poll "+q.poll());
        q.display();
        System.out.println("Peek "+q.peek());

        System.out.println("Size : "+q.size());
    }
}
