package HelloWorld.Jeongho;


import java.util.Arrays;

class Solution5 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i< d.length; i++){
            budget -= d[i];
            if(budget>=0) {
                answer++;
            }else{
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_05 {
    //배열이 주어지고 매개변수 budget을 최대한 활욜해서 최대 몇개 요소를 사용할수 있는지
    //budget이 0될때가 까지 돌아가는 while문 쓰고
    //배열에있는 요소 쓸때마다 budget에서 빼주고 그 횟수 count
    // 그렇게해서 count가 가장클때를 출력
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        sol.solution(d, budget);
    }
}
