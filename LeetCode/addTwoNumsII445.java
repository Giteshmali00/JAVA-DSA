public class addTwoNumsII445 {
    public static Node addTwoNumbers(Node l1, Node l2) {        
        String num1 = "";
        String num2 = "";
        while(l1 != null || l2 != null){
            if(l1 != null){
                num1 += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                num2 += l2.val;
                l2 = l2.next;
            }        
        }
       
        Node ans = null;
        int n = num1.length();
        int m = num2.length();
        int carry = 0;
        for(int i = 0; i < n || i < m; i++){
            int v1 = 0;
            int v2 = 0;
            if(i < n) v1 = num1.charAt(n-i-1) - '0';
            if(i < m) v2 = num2.charAt(m-i-1) - '0';
            int sum = v1 + v2 + carry;
            Node Node = new Node(sum%10);
            Node.next = ans;
            ans = Node;
            if(sum > 9) carry = 1;
            else carry = 0;
        }
        if(carry != 0){
            Node Node = new Node(1);
            Node.next = ans;
            ans = Node;
        }

        return ans;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertAtTail(8);
        list1.insertAtTail(6);
        list1.insertAtTail(4);
        list1.insertAtTail(3);

        LinkedList list2 = new LinkedList();
        list2.insertAtTail(7);
        list2.insertAtTail(9);
        list2.insertAtTail(6);

        LinkedList ans = new LinkedList();
        ans.head = addTwoNumbers(list1.head, list2.head);
        ans.display();
    }
}
