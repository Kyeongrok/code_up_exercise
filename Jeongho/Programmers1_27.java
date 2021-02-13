class Solution27 {
    public long[] solution(long n) {

        long[] answer = new long[Long.toString(n).length()];
        for(int i = 0; i<answer.length;i++){
            answer[i] = n %10;
            n /=10;
            System.out.print(answer[i]);
        }
        return answer;
    }
//    String으로 풀기
//    String a = "" + n;
//    int[] answer = new int[a.length()];
//    int cnt=0;
//
//        while(n>0) {
//        answer[cnt]=(int)(n%10);
//        n/=10;
//        System.out.println(n);
//        cnt++;
//    }
}

public class Programmers1_27 {
    public static void main(String[] args) {
        Solution27 sol = new Solution27();
        int n = 12345;
        sol.solution(n);
    }
}
