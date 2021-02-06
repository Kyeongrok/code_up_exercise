class Solution16 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a >b){
            int tmp = a;
            a =b;
            b =tmp;
        }
        while(a <= b){
            answer += a;
            a++;
        }
        return answer;
    }
}
public class Programmers1_16 {
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        int a = 5;
        int b = 3;
        sol.solution(a, b);
    }
}
