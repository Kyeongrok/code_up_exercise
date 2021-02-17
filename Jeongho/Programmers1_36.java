class Solution36 {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int a =0;
        for(int i = 0; x > 0; i++){
            a += x%10;
            x /= 10;
        }
        System.out.println(a+" "+ tmp);
        if(tmp % a == 0){
            System.out.println(answer);
            return answer;
        }else{
            answer = false;
            System.out.println(answer);
            return answer;
        }

    }
}
public class Programmers1_36 {
    public static void main(String[] args) {
        Solution36 sol = new Solution36();
        int x = 10;
        sol.solution(x);
    }
}
