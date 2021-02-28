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
        LinkedList<Integer> lis = new LinkedList<>();// 안에 대기목록
        LinkedList<Integer> list = new LinkedList<>();// index

        //첫번째 인쇄를 하고 다음것을 진행 시켜야함

        // lis를 기분으로 que1에서 젤 앞에있는거 비교해서 큰게 있으면 빼서 뒤로 보내고
        // 없으면 그대로 유지
        // 여기서 1증가 시키고 젤 큰거 빼고
        // 반복... unitl  location이랑 같게.. 중복된게 있으면..?
        // que2도 같이 진행시켜서 que2에서 젤 앞에 값이랑 location 이랑 같으면 되잖
        for(int i = 0; i < priorities.length; i++) {//lis에 넣는 과정
            lis.add(i, priorities[i]);
            list.add(i, i);
        }
//        Queue<Integer> que1 = new LinkedList<>();// list
//        Queue<Integer> que2 = new LinkedList<>();// index
//        int[] arr = new int[priorities.length];
//        for(int i = 0; i < priorities.length; i++){
//            que1.offer(priorities[i]);
//            que2.offer(i);
//        }
        int print = 0;//인쇄 할때만
        while(list.size() > 0){// 다 없어질 때 까지
                for (int i = 0; i < lis.size(); i++) {//젤 큰 숫자들 거르는 과정
                    for (int j = i + 1; j < lis.size(); j++) {
                        if (lis.get(i) < lis.get(j)) { // 앞에것보다 클경우
                            lis.addLast(lis.removeFirst());
                            list.addLast(list.removeFirst());
                            break;
                        }// 젤 큰숫자가 되면 바로 끊어 줘야 하는데..
                        if (j == lis.size() - 1) break;
                    }//for
                    if (i == lis.size() - 1) break;
                }//for
            for(int t =0; t < lis.size(); t++){
                System.out.print(lis.get(t));
            }
            System.out.println();
                 if(list.get(0) != location) {// 인쇄
                     lis.removeFirst();
                     list.removeFirst();
                     print++;
                 }
                 if (list.get(0) == location){
                    answer = print;
                    System.out.println(answer);
                    return answer;
                 }


        }


/*
        for (int i = 0; i < priorities.length; i++) {
            for (int j = i + 1; j < priorities.length; j++) {
                if (priorities[i] < priorities[j]) {
                    stack.add(i);// index를 넣어야됨
                    break;
                }
                if (j == priorities.length - 1) {//i와 j들을 다 비교했는데 아무일도 없다? -> 제일 큰 숫자
                    list.add(id, i);
                    lis.add(id, priorities[i]);
                    id++;
                }
            }//for
            if (i == priorities.length - 1) {
                list.add(id, i);
                lis.add(id, priorities[i]);
                id++;
            }
        }//for
        while(!stack.isEmpty()) {//남은 것들 먼저 들어온 순서대로 들어간다
            int a = stack.poll();
            list.add(id, a);
            lis.add(id, priorities[a]);
            id++;
        }//한번했음



        for (Integer integer : list) {
            System.out.print(integer);
            //34012
        }
        //lis 에 있는것도 바뀌어야 비교를 하던지 말던지 핱텐데..
        System.out.println();
        for(int i = 0; i < lis.size(); i++){
            System.out.print(lis.get(i));
        }
        //add 쓰면 안된다...
// 앞에거 지우고.. 스택에 넣자

//        int cnt = 1;
//        while(list.size() >=1) {//계속 인쇄 34012
//            if (list.get(0) != location) {
//                list.removeFirst();//4012
//
//                for(int i = 0; i < list.size(); i++){
//
//                }
//            } else {
//                answer = cnt;
//            }
//        }
        //찾는 과정이 아니라 location이 인쇄될때까지 진행



 */
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
