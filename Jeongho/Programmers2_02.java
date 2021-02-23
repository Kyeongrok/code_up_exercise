package HelloWorld.Jeongho;

import java.util.Stack;

class Solution_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        /*
        첫번째 배열이 완료될때까지 진행
        각각 배열이 100이 되면 더하는 걸 멈춤 그리고 인덱스 넣고, 넣은 인덱스엔 -1
        첫번째가 100이 되면 스택에 넣은것들 다빼고...
        두번째부터 반복
        차례대로 진행되어야함
         */
        Stack<Integer> stk = new Stack<>();
        int[] answer = {};
        for(int t = 0; t < progresses.length; t++) {
            while (progresses[t] <= 100) { // 진도 나아가는 과정
                for (int i = 0; i < progresses.length; i++) {
                    if (progresses[i] < 100 && progresses[i] != -1) {
                        progresses[i] += speeds[i];
                    }
                    if (progresses[i] >= 100 ) { // 한번 100이 되고 스택에 들어간것들도 중복으로 들어갈수 있음 이미 100이 된것은 넘어가야됨
                        stk.push(i);
                        progresses[i] =1;
                    }
                }
            }
            for (int i = 0; i < progresses.length; i++) {//여기서 하나씩 검사하면서 이제 answer에다 넣어주는건데
                if (progresses[i] > 100) {
                    int id = 0;
                    while (!stk.empty()) {// 바로 다음 인덱스가 있는지 없는지 확인해야함 차례대로니까
                        stk.pop();
                        id++;
                    }
                }
            }
        }
        //두개의 과정이 한 싸이클안에서 이뤄져야함

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
