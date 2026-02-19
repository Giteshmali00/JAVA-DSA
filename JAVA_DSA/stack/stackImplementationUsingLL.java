
public class stackImplementationUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        private Node head;
        private int size = 0;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop() throws Error{
            if(head==null) throw new Error("Stack is Empty!");
            int ele = head.val;
            head = head.next;
            size--;
            return ele;
        }
        int peek() throws Error{
            if(head==null) throw new Error("Stack is Empty!");
            return head.val;
        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {return size;}

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());

        System.out.println("Size : "+st.size());
    }
}
