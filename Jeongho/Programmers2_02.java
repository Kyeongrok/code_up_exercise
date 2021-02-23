package HelloWorld.Jeongho;

import java.util.Stack;

class Solution_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        /*
        첫번째 배열이 완료될때까지 진행
        각각 배열이 100이 되면 더하는 걸 멈춤 그리고 인덱스 넣고, 넣은 인덱스엔 -1
        첫번째가 100이 되면 스택에 넣은것들 다빼고...
        두번째부터 반복
         */
        Stack<Integer> stk = new Stack<>();
        int[] answer = {};
        while(progresses[0] <= 100) { // progress first
            for (int i = 0; i < progresses.length; i++) {
                if (progresses[i] < 100) {
                    progresses[i] += speeds[i];
                }
                if (progresses[i] > 100) {
                    stk.push(i);
                }
            }
        }
        for(int i = 0; i < progresses.length; i++){
            if(progresses[i] > 100){
                int id = 0;
                while(!stk.empty()){
                    stk.pop();
                    id++;
                }
            }
        }


        return answer;
    }
}
public class Programmers2_02 {
    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        sol.solution(progresses, speeds);
    }
}
