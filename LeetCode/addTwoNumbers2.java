public class addTwoNumbers2 {
    //Method 1 :- Brute force Approach by Gitesh Mali (Worst Method)
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node ans = new Node(0);
        Node temp = ans;
        int sum = 0;
        while(l1 != null && l2 != null){
            sum = sum + l1.val + l2.val;
            if(sum < 10){
                temp.next = new Node(sum);
                sum = 0;
            }else{
                String str = new String(sum+"");
                sum = str.charAt(0) - '0';
                int value = str.charAt(1) - '0';
                temp.next = new Node(value);
            }
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum += l1.val;
            if(sum < 10){
                temp.next = new Node(sum);
                sum = 0;
            }else{
                String str = new String(sum+"");
                sum = str.charAt(0) - '0';
                int value = str.charAt(1) - '0';
                temp.next = new Node(value);
            }
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2 != null){
           sum += l2.val;
            if(sum < 10){
                temp.next = new Node(sum);
                sum = 0;
            }else{
                String str = new String(sum+"");
                sum = str.charAt(0) - '0';
                int value = str.charAt(1) - '0';
                temp.next = new Node(value);
            }
            temp = temp.next;
            l2 = l2.next;
        }
        if(sum != 0) temp.next = new Node(sum);
        return ans.next;
    }
    //Method 2 :- Much much better than Method 1
    public static Node addTwoNumbers2(Node l1, Node l2) {
        Node ans = new Node(-1);
        Node temp = ans;
        int carry = 0;
        while(l1 != null || l2 != null){
            int val1 = 0, val2 = 0;
            if(l1 != null) val1 = l1.val;
            if(l2 != null) val2 = l2.val;
            int sum = val1 + val2 + carry;
            temp.next = new Node(sum%10);
            temp = temp.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(sum > 9) carry = 1;
            else carry = 0;
        }
        if(carry == 1){
            temp.next = new Node(1);
        }

        return ans.next;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insertAtTail(2);
        list1.insertAtTail(4);
        list1.insertAtTail(3);

        list2.insertAtTail(5);
        list2.insertAtTail(6);
        list2.insertAtTail(4);

        LinkedList ans = new LinkedList();
        ans.head = addTwoNumbers(list1.head, list2.head);
        ans.display();

        ans.head = addTwoNumbers2(list1.head, list2.head);
        ans.display();
    }
}
