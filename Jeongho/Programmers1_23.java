class Solution23 {
    public int solution(int n) {
        int a = 0;
        for(int i = 1; i <= n; i++){
            if(n % i== 0) {
             a+= i;
            }
        }
//        System.out.println(a);
        return a;
    }
}
public class Programmers1_23 {
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        int n = 12;
        sol.solution(n);
    }
}
