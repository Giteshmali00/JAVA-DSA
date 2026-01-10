
public class LLCycleII142 {
    static int ansidx;

    public static Node detectCycle(Node head) {
        if (head == null || head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow != fast)
            return null;
        Node temp = head;
        while (slow != temp) {
            slow = slow.next;
            temp = temp.next;
            ansidx++;
        }

        return slow;
    }

    public static void main(String[] args) {
        ansidx = 0;
        LinkedList list = new LinkedList();

        list.insertAtTail(2);
        list.insertAtTail(5);
        list.insertAtTail(3);
        list.insertAtTail(1);
        list.insertAtTail(6);

        list.tail.next = list.head.next.next;

        Node ans = detectCycle(list.head);

        if (ans != null) {
            System.out.println("tail connects to node index " + ansidx);
        } else {
            System.out.println("no cycle");
        }
    }
}