package HelloWorld.Jeongho;

import java.util.Scanner;


public class Programmers1_40 {
    public static String solution(int a, int b){
        String answer = "";
        for(int i = 0; i<b; i++){
            for(int j = 0; j<a; j++){
                answer += "*";
            }
            answer +="\n";
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        solution(a, b);
    }
}
