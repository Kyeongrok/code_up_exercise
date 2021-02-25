import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

class Solution_3 {
    public int[] solution(int[] prices) {
        ArrayList<Integer> arr = new ArrayList<>();
        int j = 0;
        for(int i = 0; i< prices.length; i++) {
            int cnt = 0;
            for (j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    cnt++;
                    break;
                }else if(i == prices.length-1){
                    break;
                }
                else {
                    cnt++;
                }
            }
            arr.add(cnt);
            if(j == prices.length) continue;
        }
        int[] answer = new int[arr.size()];
        for(int i= 0; i < arr.size(); i ++){
            answer[i] = arr.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class Programmers2_03 {
    public static void main(String[] args) {
        Solution_3 sol = new Solution_3();
        int[] prices = {1,2,3,2,3};
        sol.solution(prices);
    }
}
