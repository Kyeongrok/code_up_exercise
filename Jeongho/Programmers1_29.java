class Solution29 {
    public long solution(long n) {
        long answer = 0;
        double fp = (Math.sqrt(n) - (int)Math.sqrt(n));
        if(fp > 0){
            System.out.println("-1");
            return -1;
        }else{
            answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        }
        System.out.println(fp);
        System.out.println(answer);

        return answer;
    }
}
public class Programmers1_29 {
    public static void main(String[] args) {
        Solution29 sol = new Solution29();
        long n = 121;
        sol.solution(n);
    }
}
