public class studentEatLunch1700{
    public static int countStudents(int[] stud, int[] sand) {
        int n = stud.length;
        int zero = 0;
        int one  = 0;

        for(int i = 0; i < n; i++){
            if(stud[i]==0) zero++;
            else one++;
        }
        for(int i = 0; i < n; i++){
            if(sand[i] == 0 && zero > 0) zero--;
            else if(sand[i]==1 && one > 0) one--;
            else break;
        }
        return zero+one;
    }
    public static void main(String[] args) {
        int[] student = {1,1,1,0,0,1};
        int[] sandwitch = {1,0,0,0,1,1};

        int ans = countStudents(student, sandwitch);

        System.out.println("Number of students unable to eat sandwitch --> "+ans);
    }
}