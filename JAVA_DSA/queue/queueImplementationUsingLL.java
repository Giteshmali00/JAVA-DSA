public class queueImplementationUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class MyQueue{
        private Node front;
        private Node rear;
        private int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(rear==null) front = rear = temp;
            else{
                front.next = temp;
                front = temp;
            }
            size++;
        }

        int poll() throws Error{
            if(rear==null) throw new Error("Queue is Empty!");
            int x = rear.val;
            rear = rear.next;
            size--;
            return x;
        }

        int peek() throws Error{
            if(rear==null) throw new Error("Queue is Empty!");
            return rear.val;
        }

        void display(){
            if(rear==null) throw new Error("Queue is Empty!");
            Node temp = rear;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {return size;}

    }
    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println("Poll : "+q.poll());
        q.display();
        System.out.println("Peek : "+q.peek());

        System.out.println("Size : "+q.size());
    }
}
