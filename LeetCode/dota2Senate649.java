import java.util.LinkedList;
import java.util.Queue;

public class dota2Senate649 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        int i = 0;
        for(i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R') R.add(i);
            else D.add(i);
        }

        while(!R.isEmpty() && !D.isEmpty()){
            if(R.peek() < D.peek()){
                D.poll();
                R.poll();
                R.add(i++);
            }
            else{
                R.poll();
                D.poll();
                D.add(i++);
            }
        }

        if(R.isEmpty()) return "Dire";
        return "Radiant";
    }
    public static void main(String[] args) {
        String ans = predictPartyVictory("RRDDRRDDDR");
        System.out.println("The Winner is : "+ans);
    }
}
