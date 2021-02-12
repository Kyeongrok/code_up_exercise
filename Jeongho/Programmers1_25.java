package HelloWorld.Jeongho;
import java.util.*;

class Solution25 {
    public int solution(int n) {
        int answer = 0;
//        String ans = Integer.toString(n);
//        String[] a = ans.split("");
//        while(n > 0){
//            answer+=n%10;
//            if(n<10)
//                break;
//
//            n=n/10;
//        }
        String[] a = String.valueOf(n).split("");//가독성은 좋지만 효율성이 떨어짐
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
