package HelloWorld.Jeongho;

import java.util.LinkedList;
import java.util.Scanner;

class Solution3 {
    public int solution(int n, int[] lost, int[] reserve) {
        /*greedy알고리즘: 지역적인 조건의 최적해를 매번 고르다보면 전역적인 조건에서도 최적의해를 구할수 있다고 생각한 알고리즘 실제는 그렇지 않으므로 적용할수있는 상황에서만 적용가능
        n=전체학생수 lost 잃어버린 학생의 배열 , reserve 여벌이 있는 학생의 배열
        reserve 앞뒤의 배열만 빌려주기 가능 수업을 진행할 수 있는 사람의 최대를 구해
        전체학생수는 2명~30명, 있는 학생도 있음, 3개 상황에 중복은 당연히 있으면 안됨
       1.LinkedList 에서 lost 배열 빼주고 reserve 빼주고 여기서 있는 애들 빼주면 옷을 가지고 있는 애들이 나옴
       2. 리스트의 사이즈 두고
       3. reserve 배열 앞뒤 숫자가 lost 배열에 있는지 확인하고 있으면 pos 배열의 크기를 늘린다.
       4. reserve 배열의 크기와 리스트 사이즈를 더한다. -> 수업을 할 수 있는 최대의 학생수
         */
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int answer = 0;
//        for(int i = 0; i < list.size(); i++){//lost배열 빼줌
//            for(int j = 0; j < lost.length; j++) {
//                if (list.get(i) == lost[j]) {
//                    list.remove(i);
//                }
//            }
//        }
//        for(int i = 0; i < list.size(); i++){//reserve배열 빼줌
//            for(int j = 0; j < reserve.length; j++){
//                    if(list.get(i) == reserve[j]) {
//                        list.remove(i);
//                    }
//            }
//        }
        // n - lost || lost reserve 비교해주고 맞는 값이 있으면 cnt에 더하고 두개 더한다
        answer = n - lost.length;
        int cnt = 0;//체육복은 한번만 빌려줄수 있다, 여벌이 있는 학생 사이에 있으면 중복이 있을경우도 있음
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
                        reserve[j] = -1;// 한번 하면 겹치지 못하게 만든다
                        answer++;
                        break;
                    }
                }
            }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] lost = {2, 4};//서로 겹칠 가능성이 있음
        int[] reserve ={1, 3, 5};
        Solution3 sol = new Solution3();
        sol.solution(n,lost, reserve);
    }
}
