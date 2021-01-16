import java.util.Scanner;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        /*greedy알고리즘: 지역적인 조건의 최적해를 매번 고르다보면 전역적인 조건에서도 최적의해를 구할수 있다고 생각한 알고리즘 실제는 그렇지 않으므로 적용할수있는 상황에서만 적용가능
        n=전체학생수 lost 잃어버린 학생의 배열 , reerve 여벌이 있는 학생의 배열
        reserve 앞뒤의 배열만 빌려주기 가능
        전체학생수는 2~30, 있는 학생도 있음, 3개 상황에 중복은 당연히 있으면 안됨
       1.LinkedList에서 lost배열 빼주고 reserve 빼주고 여기서 있는 애들 빼주면
         */
        int answer = 0;
        return answer;
    }
}
public class Programmers1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lost = new int[2];
        int[] reserver = new int[3];
        Solution sol = new Solution();
    }
}
