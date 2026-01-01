package LeetCode;

public class middleOfTheLinkedList876 {
    // Method 1 :- 2 pass approach
    public static Node middleNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        temp = head;

        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Method 2 :- 1 pass approach (Better than M1)
    public static Node middleNode2(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        list.display();

        System.out.println("Method 1 Ans :- " + middleNode(list.head).val);
        System.out.println("Method 2 Ans :- " + middleNode2(list.head).val);

    }
}
