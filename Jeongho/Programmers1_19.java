class Solution19 {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i<= n; i++){
            if(i%2 ==1){
                answer += "수";
            }
            if(i%2 ==0){
                answer += "박";
            }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_19 {
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        int n = 3;
        sol.solution(n);
    }
}
