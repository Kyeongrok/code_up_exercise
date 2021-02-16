package HelloWorld.Jeongho;
class Solution34 {
    public int solution(long num) {
        int answer = 0;
        while(num != 1){
            if(num % 2 == 0){
                num /=2;
                answer++;
            }else{
                num = num*3 + 1;
                answer++;
            }
        }
        if(answer > 500){
            answer = -1;
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_34 {
    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        long n = 626331;
        sol.solution(n);
    }
}
