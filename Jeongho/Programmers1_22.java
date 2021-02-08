class Solution22 {
    public String solution(String s, int n) {
        // .charAt() 쓰고 n씩 더함
        // 공백은 무시
        // 대문자에서 소문자숫자를 넘어서게되는건 else if를 그냥크게 잡으면 됨
        // 대신 소문자가 대문자범위에 포함되어버림 소문자가 대문자가 되어버
        String answer = "";
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                answer += Character.toString(s.charAt(i));
                continue;
            }
            a = s.charAt(i) + n;
            if(a > 122 && s.charAt(i) >96){// 소문자
                a -= 26;
            }else if(a > 90 && s.charAt(i) <= 90){// 대문자
                a -= 26;
            }

            char b = (char)a;
            String c = Character.toString(b);
            answer += c;
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_22 {
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        String s = "aBz";
        int n = 20;
        sol.solution(s, n);
    }
}
