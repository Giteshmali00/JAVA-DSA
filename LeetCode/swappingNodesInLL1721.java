
public class swappingNodesInLL1721 {
    // Method 1 :- TC = O(~3n) which means O(n) Not good...
    public static Node swapNodes(Node head, int k) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        Node n1 = head;
        Node n2 = head;

        for (int i = 1; i < k; i++) {
            n1 = n1.next;
        }
        for (int i = 1; i <= n - k; i++) {
            n2 = n2.next;
        }

        int t = n1.val;
        n1.val = n2.val;
        n2.val = t;

        return head;
    }

    // Method 2 :- Slightly Better than Method 1
    public static Node swapNodes2(Node head, int k) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        Node n1 = head;
        Node n2 = head;

        for (int i = 1; i < k; i++) {
            n1 = n1.next;
        }
        int pnk = n - k;
        if (pnk < 0) {
            pnk = -pnk;
        }
        for (int i = 1; i <= pnk; i++) {
            n2 = n2.next;
        }

        int t = n1.val;
        n1.val = n2.val;
        n2.val = t;

        return head;
    }

    // Method 3 :- Slight Better than Methd 1 & 2
    public static Node swapNodes3(Node head, int k) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        Node n1 = head;
        Node n2 = head;

        for (int i = 1; i < k; i++) {
            n1 = n1.next;
        }
        int pnk = n - k;
        if (pnk <= 0 || k >= n / 2) {
            if (pnk < 0)
                pnk = -pnk;
            for (int i = 1; i <= pnk; i++) {
                n2 = n2.next;
            }
        } else {
            n2 = n1;
            for (int i = 1; i <= pnk - k + 1; i++) {
                n2 = n2.next;
            }
        }

        int t = n1.val;
        n1.val = n2.val;
        n2.val = t;

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

        list.display();
        list.head = swapNodes(list.head, 2);
        list.display();

        list.head = swapNodes2(list.head, 1);
        list.display();

        list.head = swapNodes3(list.head, 4);
        list.display();
    }
}
