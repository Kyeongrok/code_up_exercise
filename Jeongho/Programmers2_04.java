import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution_4 {
    public int solution(int[] priorities, int location) {
        /*
        처음부터 끝까지 비교해서
        우선순위가 높은게 하나라도 있으면 스택에 집어넣고
        우선순위가 같거나 크면 대기열에 넣는다
         */
        int answer = 0;
        int[] ans = new int[priorities.length];// 대기목록
        Queue<Integer> stack = new LinkedList<>();
        int id = 0;
        LinkedList<Integer> lis = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        //첫번째 인쇄를 하고 다음것을 진행 시켜야함
        for(int i = 0; i < priorities.length; i++){
            lis.add(i, priorities[i]);
        }
        for (int i = 0; i < lis.size(); i++) {
            for (int j = i + 1; j < lis.size(); j++) {
                if (lis.get(i) < lis.get(j)) {
                    stack.add(i);// index를 넣어야됨
                    break;
                }
                if (j == lis.size() - 1) {//i와 j들을 다 비교했는데 아무일도 없다? -> 제일 큰 숫자
                    list.add(id, i);
                    id++;
                }
            }//for
            if (i == lis.size() - 1) {
                list.add(id, i);
                id++;
            }
        }//for
        while(!stack.isEmpty()) {//남은 것들 먼저 들어온 순서대로 들어간다
            list.add(id, stack.poll());
            id++;
//            if (id == list.size()) break;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            //34012
        }//한번했음
        //lis 에 있는것도 바뀌어야 비교를 하던지 말던지 핱텐데..
        System.out.println();
        for(int i = 0; i < lis.size(); i++){

        }
        int cnt = 1;
//        while(list.size() >=1) {//계속 인쇄 34012
//            if (list.get(0) != location) {
//                list.remove(0);//4012(
//                for(int i = 0; i < list.size(); i++){
//
//                }
//            } else {
//                answer = cnt;
//            }
//        }
        //찾는 과정이 아니라 location이 인쇄될때까지 진행
        return answer;
    }
}

public class Programmers2_04 {
    public static void main(String[] args) {
        Solution_4 sol = new Solution_4();
        int priorities[] = {2,1,3,4,2};
        int location = 2;
        sol.solution(priorities, location);
    }
}
