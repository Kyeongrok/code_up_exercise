package HelloWorld.Jeongho;
class Solution35 {
    public double solution(int[] arr) {
        double answer = 0;
        double a = 0;
        for(int i = 0; i < arr.length; i++){
            a += arr[i];
        }
        answer = a/arr.length;
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_35 {
    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        int[] arr = {1,2,3,4};
        sol.solution(arr);
    }
}
