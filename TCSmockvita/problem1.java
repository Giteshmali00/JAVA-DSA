import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] heights = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                char ch = sc.next().charAt(0);
                if(ch=='*'){
                    heights[j]++;
                }
            }
        }

        int k = sc.nextInt();

        for(int i=0; i<k; i++){
            String instruction = sc.next();
            heights = solve(heights, m, n, instruction);

            int temp = m;
            m = n;
            n = temp;
        }

        print(heights, m, n);
        sc.close();
    }

    private static int[] solve(int[] heights, int m, int n, String instruction) {
        int[] freq = new int[m+1];

        for(int h : heights){
            freq[h]++;
        }

        int[] suffix = new int[m+2];

        for(int i=m; i>=1; i--){
            suffix[i] = suffix[i+1]+freq[i];
        }

        int[] ans = new int[m];

        if(instruction.equals("right")){
            for(int i=0; i<m; i++){
                ans[i] = suffix[i+1];
            }
        }else{
            for(int i=0; i<m; i++){
                ans[i] = suffix[m-i];
            }
        }

        return ans;
    }

    public static void print(int[] heights, int m, int n) {
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i>=m-heights[j]){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }

                if(j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}