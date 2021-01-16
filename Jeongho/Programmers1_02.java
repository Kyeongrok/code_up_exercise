import java.util.Scanner;

public class Programmers1_02 {
    public static String solution(String s){

        String answer="";
        if(s.length()%2==1){//substring-> 문자열에서 뽑은 인덱스에서 끝의 인덱스만큼 뽑아주는 메소드
            answer=s.substring(s.length()/2,s.length()/2+1);
        }else{
            answer=s.substring(s.length()/2-1, s.length()/2+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
    }
}
