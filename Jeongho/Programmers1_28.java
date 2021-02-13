class Solution28 {
    public long solution(long n) {
        String answer = "";
        answer +=n;
        long[] ans = new long[Long.toString(n).length()];
        for(int i = 0; i<ans.length;i++){
            ans[i] = n %10;
            n /=10;
        }//273811
        for (int i = ans.length-1; i >0;i-- ) {
            for(int j = 0; j< i; j++){
                if(ans[j] < ans[j+1]) {
                    long tmp = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i<ans.length; i++){
            Long.toString(ans[i]);
            answer += ans[i];
        }
        System.out.print(answer);

        return Long.parseLong(answer);
    }
}
public class Programmers1_28 {
    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        long n = 118372;
        sol.solution(n);
    }
}
