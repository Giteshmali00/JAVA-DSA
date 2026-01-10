
public class spiralMatrixIV2326 {
    public static void print(int[][] ans) {
        int m = ans.length;
        int n = ans[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method 2 :- slightly better than method 1
    public static int[][] spiralMatrix2(int m, int n, Node head) {
        int[][] ans = new int[m][n];
        Node temp = head;

        int trow = 0, tcol = 0;
        int lrow = m - 1, lcol = n - 1;

        while (trow <= lrow && tcol <= lcol) {
            for (int i = tcol; i <= lcol; i++) {
                if (temp != null) {
                    ans[trow][i] = temp.val;
                    temp = temp.next;
                } else
                    ans[trow][i] = -1;

            }
            trow++;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = trow; i <= lrow; i++) {
                if (temp != null) {
                    ans[i][lcol] = temp.val;
                    temp = temp.next;
                } else
                    ans[i][lcol] = -1;

            }
            lcol--;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = lcol; i >= tcol; i--) {
                if (temp != null) {
                    ans[lrow][i] = temp.val;
                    temp = temp.next;
                } else
                    ans[lrow][i] = -1;

            }
            lrow--;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = lrow; i >= trow; i--) {
                if (temp != null) {
                    ans[i][tcol] = temp.val;
                    temp = temp.next;
                } else
                    ans[i][tcol] = -1;

            }
            tcol++;
        }

        return ans;
    }

    // Method 1 :- prefilled -1's
    public static int[][] spiralMatrix(int m, int n, Node head) {
        int[][] ans = new int[m][n];
        Node temp = head;

        int trow = 0, tcol = 0;
        int lrow = m - 1, lcol = n - 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = -1;
            }
        }
        while (trow <= lrow && tcol <= lcol) {
            for (int i = tcol; i <= lcol; i++) {
                if (temp == null)
                    break;
                ans[trow][i] = temp.val;
                temp = temp.next;
            }
            if (temp == null)
                break;
            trow++;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = trow; i <= lrow; i++) {
                if (temp == null)
                    break;
                ans[i][lcol] = temp.val;
                temp = temp.next;
            }
            if (temp == null)
                break;
            lcol--;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = lcol; i >= tcol; i--) {
                if (temp == null)
                    break;
                ans[lrow][i] = temp.val;
                temp = temp.next;
            }
            if (temp == null)
                break;
            lrow--;
            if (trow > lrow || tcol > lcol)
                break;
            for (int i = lrow; i >= trow; i--) {
                if (temp == null)
                    break;
                ans[i][tcol] = temp.val;
                temp = temp.next;
            }
            tcol++;
        }

        return ans;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(3);
        list.insertAtTail(0);
        list.insertAtTail(2);
        list.insertAtTail(6);
        list.insertAtTail(8);
        list.insertAtTail(1);
        list.insertAtTail(7);
        list.insertAtTail(3);
        list.insertAtTail(9);
        list.insertAtTail(4);
        list.insertAtTail(2);
        list.insertAtTail(5);
        list.insertAtTail(5);
        list.insertAtTail(0);

        int m = 3, n = 5;
        int[][] ans = spiralMatrix(m, n, list.head);
        print(ans);

        System.out.println();

        // ans = spiralMatrix2(m, n, list.head);
        // print(ans);

    }
}
