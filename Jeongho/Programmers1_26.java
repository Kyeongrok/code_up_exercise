package HelloWorld.Jeongho;

import java.util.Locale;
import java.util.regex.Pattern;

class Solution26 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        String b = "";
        for(int i = 0; i < a.length; i++) {
            b = a[i];
            for (int j = 0; j < b.length(); j++) {
                if (j % 2 == 0) {//짝수 일때 대문자
                    if (b.charAt(j) < 123 && b.charAt(j) > 96) {
                        answer += (b.charAt(j)+"").toUpperCase();
                    } else {
                        answer += b.charAt(j);
                    }
                }
                if (j % 2 == 1) {//홀수 일때 소문자
                    if (b.charAt(0) < 91 && b.charAt(0) > 64) {
                        answer += (b.charAt(j)+"").toLowerCase();
                    } else {
                        answer += b.charAt(j);
                    }
                }
            }
            if(i != a.length-1)
                answer += " ";
        }
        System.out.println(answer);

        return answer;
    }
}
public class Programmers1_26 {
    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        String s = "try hello world";
        sol.solution(s);
    }
}
