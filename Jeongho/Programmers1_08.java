package HelloWorld.Jeongho;

import java.util.*;

class Solution8 {
    public int[] solution(int[] answers) {
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == std1[i % 5])
                cnt[0]++;
            if (answers[i] == std2[i % 8])
                cnt[1]++;
            if (answers[i] == std3[i % 10])
                cnt[2]++;
        }
        // 최대값 찾기
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (cnt[i] > max)
                max = cnt[i];
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(cnt[i] == max){
                tmp.add(i+1);
            }
        }
        // 최대값과 같은 수포자 answer에 넣기.
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i);

        return answer;
    }
}
public class Programmers1_08 {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[] a ={1, 3, 2, 4, 2};
        sol.solution(a);
    }
}
