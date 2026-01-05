package LeetCode;

public class LLCycle141 {
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.tail.next = list.head.next;

        System.out.println(hasCycle(list.head));
    }
}
