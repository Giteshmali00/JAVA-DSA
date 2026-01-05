package LeetCode;

public class intersectionOfTwoLL160 {

    public static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        int m = 0;
        while (tempA != null) {
            tempA = tempA.next;
            m++;
        }

        Node tempB = headB;
        int n = 0;
        while (tempB != null) {
            tempB = tempB.next;
            n++;
        }

        tempA = headA;
        tempB = headB;
        if (m > n) {
            for (int i = 0; i < m - n; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < n - m; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;

    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList common = new LinkedList();
        common.insertAtTail(8);
        common.insertAtTail(4);
        common.insertAtTail(5);

        list1.insertAtTail(4);
        list1.insertAtTail(1);

        list2.insertAtTail(5);
        list2.insertAtTail(6);
        list2.insertAtTail(1);

        list1.tail.next = common.head;
        list2.tail.next = common.head;

        Node ans = getIntersectionNode(list1.head, list2.head);
        System.out.println("Intersection at : " + ans.val);

    }
}
