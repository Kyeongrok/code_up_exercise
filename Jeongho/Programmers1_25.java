package HelloWorld.Jeongho;
import java.util.*;

class Solution25 {
    public int solution(int n) {
        int answer = 0;
//        String ans = Integer.toString(n);
//        String[] a = ans.split("");
        String[] a = String.valueOf(n).split("");
        for(int i = 0; i < a.length; i++){
            answer += Integer.parseInt(a[i]);
        }

        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_25 {
    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        int n = 987;
        sol.solution(n);
    }
}
