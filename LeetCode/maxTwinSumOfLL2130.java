public class maxTwinSumOfLL2130 {
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node h2 = slow.next;
        slow.next = null;

        return h2;
    }
    public static int pairSum(Node head) {
        Node h2 = reverse(middle(head));

        int maxVal = head.val + h2.val;
        while(head != null && head.next != null){
            head = head.next;
            h2 = h2.next;
            int nextMax = head.val + h2.val;
            maxVal = Math.max(maxVal, nextMax); 
        }

        return maxVal;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(3);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(2);

        list.display();
        System.out.println("Maximum Twin Sum is : "+pairSum(list.head));
    }
}
