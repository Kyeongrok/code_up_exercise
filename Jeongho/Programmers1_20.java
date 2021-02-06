class Solution20 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i< a.length; i++){
            answer +=a[i]*b[i];
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_20 {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        sol.solution(a, b);
    }
}
