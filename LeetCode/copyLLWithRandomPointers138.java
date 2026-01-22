public class copyLLWithRandomPointers138 {
    // Definition for a Node.
    public static class Node {
        int val;
        Node next;
        Node random;
        Node(int var1) {
            this.val = var1;
        }
    }

    public static Node deepCopy(Node head){
        Node head2 = new Node(head.val);
        Node temp = head.next;
        Node temp2 = head2;
        while(temp != null){
            temp2.next = new Node(temp.val);
            temp = temp.next;
            temp2 = temp2.next;
        }
        return head2;
    }
    public static void mergeTwoLL(Node head, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node t1 = head;
        Node t2 = head2;
        while(t1 != null && t2 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
    }  
    public static void assignRandom(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        while(t1 != null){
            t2 = t1.next;
            if(t1.random != null)t2.random = t1.random.next;
            t1 = t1.next.next;
        }
    }
    public static void split(Node head){
        Node temp = head;
        Node temp2 = head.next;
        while(temp != null){
            temp.next = temp2.next;
            temp = temp.next;
            if(temp == null) break;
            temp2.next = temp.next;
            temp2 = temp2.next;
        }
    }
    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        // Step 1 : Create Deep copy without random connections
        Node head2 = deepCopy(head);
        // Step 2 : Join head and head2 alternatively
        mergeTwoLL(head,head2);
        // Step 3 : Assign random pointers
        assignRandom(head, head2);
        // Step 4 : Split the Linked List
        split(head);

        return head2;
    }

    public static void main(String[] args) {
        Node a = new Node(17);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        Node temp = a;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

        Node ans = copyRandomList(a);

        temp = ans;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
