class Solution39 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;
        for(int i = 0; i<answer.length; i++){
            answer[i] = a+=x;
            System.out.print(answer[i]);
        }
        return answer;
    }
}
public class Programmers1_39 {
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        int x = 2;
        int n = 5;
        sol.solution(x, n);
    }
}
