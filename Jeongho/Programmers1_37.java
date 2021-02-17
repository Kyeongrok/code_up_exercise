class Solution37 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++){
           if(i >= phone_number.length()-4){
               answer +=phone_number.charAt(i);
           }else{
               answer += "*";
           }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_37 {
    public static void main(String[] args) {
        Solution37 sol = new Solution37();
        String phone_number = "8888";
        sol.solution(phone_number);
    }
}
