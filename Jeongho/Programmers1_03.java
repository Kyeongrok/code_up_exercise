import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        /*greedy알고리즘: 지역적인 조건의 최적해를 매번 고르다보면 전역적인 조건에서도 최적의해를 구할수 있다고 생각한 알고리즘 실제는 그렇지 않으므로 적용할수있는 상황에서만 적용가능
        n=전체학생수 lost 잃어버린 학생의 배열 , reserve 여벌이 있는 학생의 배열
        reserve 앞뒤의 배열만 빌려주기 가능 수업을 진행할 수 있는 사람의 최대를 구해
        전체학생수는 2~30, 있는 학생도 있음, 3개 상황에 중복은 당연히 있으면 안됨
       1.LinkedList 에서 lost 배열 빼주고 reserve 빼주고 여기서 있는 애들 빼주면 옷을 가지고 있는 애들이 나옴
       2. 리스트의 사이즈 두고
       3. reserve 배열 앞뒤 숫자가 lost 배열에 있는지 확인하고 있으면 배열의 크기를 늘린다.
       4.reserve 배열의 크기와 리스트 사이즈를 더한다. -> 수업을 할 수 있는 최대의 학생수
         */
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num = 1;
        while(num<=n){

        }
        int answer = 0;
        return answer;
    }
}
public class Programmers1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lost = new int[2];
        int[] reserve = new int[3];
        Solution sol = new Solution();
        sol.solution(n,lost, reserve);
    }
}
