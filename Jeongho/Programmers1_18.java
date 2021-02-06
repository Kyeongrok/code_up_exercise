class Solution18 {
    public String solution(String[] seoul) {
        String answer = "";
//        while(seoul[a] != "Kim"){
//            a++;
//        }
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i] == "Kim"){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_18 {
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        String[] seoul = {"Jane", "Kim"};
        sol.solution(seoul);
    }
}
