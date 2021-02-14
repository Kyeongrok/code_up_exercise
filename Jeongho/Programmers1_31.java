class Solution31 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer += "Even";
        }else {
            answer += "Odd";
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_31 {
    public static void main(String[] args) {
     Solution31 sol = new Solution31();
     int num = 3;
     sol.solution(num);
    }
}
