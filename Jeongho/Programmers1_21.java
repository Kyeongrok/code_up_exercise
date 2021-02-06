import java.util.Arrays;

class Solution21 {
    public int solution(int n) {
        String ans = "";
        while(n > 0){
            ans = (n % 3) + ans;
            n /= 3;
        }//10 -> 3
        StringBuffer sb = new StringBuffer();
        sb.append(ans).reverse();
//        System.out.println(ans);
//        System.out.println(sb);
        String s = sb.substring(0, sb.length());
//        System.out.println(s);
        int answer = 0;
        answer = Integer.parseInt(s, 3);
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_21 {
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        int n = 45;
        sol.solution(n);
    }
}
