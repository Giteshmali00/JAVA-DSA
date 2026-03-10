import java.util.Stack;

public class nextGreaterNodeInLL1019 {
    static int size;
    public static Node reverseLLAneReturnSize(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            size++;
        }
        return prev;
    }
    public static int[] nextLargerNodes(Node head) {
        size = 0;
        head = reverseLLAneReturnSize(head);
        int[] nge = new int[size];
        Stack<Integer> st = new Stack<>();
        for(int i = size-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= head.val)
                st.pop();
            if(!st.isEmpty()) nge[i] = st.peek();
            st.push(head.val);
            head = head.next;
        }
        return nge;
    }
    static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(2);
        list.insertAtTail(7);
        list.insertAtTail(4);
        list.insertAtTail(3);
        list.insertAtTail(5);
        list.display();
        int[] ans = nextLargerNodes(list.head);

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
