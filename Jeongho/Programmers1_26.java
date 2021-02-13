package HelloWorld.Jeongho;

import java.util.Locale;
import java.util.regex.Pattern;

class Solution26 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        String b = "";
        int index = 0;
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++) {//b에 하나씩넣으면서 영어만나면 index를 count 공백이면 다시 0
            b = a[i];
            for (int j = 0; j < b.length(); j++) {
                if (index % 2 == 0) {//짝수 일때 대문자
                    if (b.charAt(j) < 123 && b.charAt(j) > 96) {
                        answer += (b.charAt(j)+"").toUpperCase();
                        index++;
                        break;
                    }else if(b.charAt(0) < 91 && b.charAt(0) > 64){
                        answer += b.charAt(j);
                        index++;
                        break;
                    } else if(b.charAt(j) != 32){
                        answer += b.charAt(j);
                        break;
                    }else if( b.charAt(j) ==32){
                        answer += b.charAt(j);
                        index = 0;
                    }
                }
                if (index % 2 == 1) {//홀수 일때 소문자
                    if (b.charAt(0) < 91 && b.charAt(0) > 64) {
                        answer += (b.charAt(j)+"").toLowerCase();
                        index++;
                        break;
                    }else if(b.charAt(j) < 123 && b.charAt(j) > 96){
                        answer += b.charAt(j);
                        index++;
                        break;
                    } else if(b.charAt(j) != 32){
                        answer += b.charAt(j);
                        break;
                    } else if(b.charAt(j) == 32){
                        answer += b.charAt(j);
                        index=0;
                    }
                }
            }
        }//공백이 있네
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_26 {
    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        String s = "try hello world  ";
        sol.solution(s);
    }
}
