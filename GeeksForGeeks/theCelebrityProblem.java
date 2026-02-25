import java.util.Stack;

public class theCelebrityProblem {
    public static int celebrity(int[][] mat) {
        // code here
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            st.push(i);
        }

        while(st.size() > 1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(mat[v1][v2]==0){//toh val2 seleb nahi hai, lekin val1 shayad hosakta hai
                st.push(v1);
            }
            else if(mat[v2][v1]==0) st.push(v2);
        }
        if(st.isEmpty()) return -1;
        int potential = st.pop();
        for(int i = 0; i < n; i++){
            if(potential==i) continue;
            if(mat[potential][i]==1) return -1;
            else if(mat[i][potential]==0) return -1;
        }

        return potential;
    }
    static void main(String[] args) {
        int[][] mat = { {1,1,1},
                        {0,1,0},
                        {1,1,0}};
        int celeb = celebrity(mat);
        System.out.println("The Celebrity is : "+celeb);
    }
}
