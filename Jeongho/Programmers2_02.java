class Solution_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        /*
        첫번째 배열이 완료될때까지 진행
        각각 배열이 100이 되면 더하는 걸 멈춤
        첫번째가 100이 되면 차례대로 100이 되었는지를 확인 1씩 추가
        두번째부터 반복
         */
        while(progresses[0] < 100){
            for(int i = 0; i < progresses.length; i++) {
                if(progresses[i] < 100) {
                    progresses[i] += speeds[i];
                }
            }
        }

        int[] answer = {};
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
