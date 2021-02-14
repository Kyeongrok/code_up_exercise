class Solution32 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        int min = n>m ? m : n;
        for(int i = min; i>=1; i--){
            if(n%i==0 && m%i==0){
                a = i;
                break;
            }
        }
        b = n*m / a; // 최소공배수 구하는공식
        answer[0] = a;
        answer[1] = b;
        System.out.println(a);
        System.out.println(b);
        return answer;
    }
}
public class Programmers1_32 {
    public static void main(String[] args) {
        Solution32 sol = new Solution32();
        int n = 2;
        int m = 5;
        sol.solution(n ,m);
    }
}
