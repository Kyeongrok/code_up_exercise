class Solution43 {
    public int solution(String dartResult) {
        // S,D,T 기준으로 찢고..
        // 10이 넘어가면 어떠케 하지..?
        String[] res = dartResult.split("S",2);

        System.out.println(res[0]);
        System.out.println(res[1]);
        int answer = 0;
        return answer;
    }
}
public class Programmers1_43 {
    public static void main(String[] args) {
        Solution43 sol = new Solution43();
        String dartResult = "1S2D*3T";
        sol.solution(dartResult);
    }
}
