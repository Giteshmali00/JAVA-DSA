public class palindromeLL234 {
    public static Node reverseLL(Node head){
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
    //Method 1 :-
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseLL(slow.next);
        slow = slow.next;
        while(slow != null){
            if(head.val == slow.val) {
                head = head.next;
                slow = slow.next;
            }
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(2);
        list.insertAtTail(1);

        System.out.println("List is palindrome => "+isPalindrome(list.head));
    }
}
