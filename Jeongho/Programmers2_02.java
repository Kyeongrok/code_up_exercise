//package HelloWorld.Jeongho;

import java.util.*;

class Solution_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        /*
       100에서 progresses들 빼주고 남은거 speeds로 나누면 얼마나 걸리는지 나오고
       그걸  days배열에 다 넣는다
       days배열을 처음부터 검사한다
       앞에배열이 뒤에 배열보다 더 크면 1씩 더하고
       작으면 거기서 answer에 index넣어주고 index의 숫자부터 다시 검사
         */
        int[] days = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            if ((100 - progresses[i]) % speeds[i] == 0) {
                days[i] = (100-progresses[i]) / speeds[i];
            }else{
                days[i] = ((100- progresses[i]) / speeds[i]) + 1;
            }
        }
        int j  = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i< days.length; i++){
            int cnt = 0;
            for(j = i +1; j < days.length; j++){
                if(days[i] < days[j]){
                    i = j -1;
                    break;
                }else cnt++;
            }
            list.add(cnt + 1);
            if(j == days.length) break;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class Programmers2_02 {
    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        sol.solution(progresses, speeds);
    }
}
