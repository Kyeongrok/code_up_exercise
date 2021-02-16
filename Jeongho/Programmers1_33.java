package HelloWorld.Jeongho;
import java.util.*;

class Solution33{
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; n > 0; i++){
            answer += n %10;
            n /=10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
public class Programmers1_33 {
    public static void main(String[] args) {
        Solution33 sol = new Solution33();
        int n = 987;
        sol.solution(n);
    }
}
