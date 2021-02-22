class Solution43 {
    public int solution(String dartResult) {
        /*
        * s,d,t 를 기준으로 구역 나눔 바로 뒤에 *,# 있는지 있으면 적용 중복 가능
        * s,d,t 순서는 모름->
        * * = 42, # = 35
        * 정수를 기준으로 찢어볼까?
        * */
        int answer = 0;
        String[] res = dartResult.split("");
        String[] A = new String[3];
        A[0] ="";
        A[1] ="";
        A[2] ="";

        int a = 0;
        for(int i = 0; i < res.length; i++){
            if(res[i].charAt(0) > 47 && res[i].charAt(0) < 58){
                A[a] += res[i];
                if(res[i+1].equals("D")){
                    A[a] = Integer.toString((int)Math.pow(Integer.parseInt(A[a]), 2));
                }
                if(res[i+1].equals("T")){
                    A[a] = Integer.toString((int)Math.pow(Integer.parseInt(A[a]), 3));
                }
                int tmp = i+2;// over range
                if(tmp < res.length) {
                    if (res[i + 2].charAt(0) == 42) {//*
                        A[a] = Integer.toString(Integer.parseInt(A[a]) * 2);
                        if (a >= 1) {
                            A[a - 1] = Integer.toString(Integer.parseInt(A[a-1]) * 2);
                        }
                    } if (res[i + 2].charAt(0) == 35 ) {//#
                        A[a] = Integer.toString(Integer.parseInt(A[a]) * (-1));
                    }
                }
                if(res[i+1].charAt(0) > 47 && res[i+1].charAt(0) < 58){
                    continue;
                }
                a++;
            }
        }
        for(int i = 0; i < A.length; i++){
            answer += Integer.parseInt(A[i]);
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_43 {
    public static void main(String[] args) {
        Solution43 sol = new Solution43();
        String dartResult = "1D2S#10S";
        sol.solution(dartResult);
    }
}
