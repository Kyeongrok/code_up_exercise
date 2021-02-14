import java.util.LinkedList;

class Solution30 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i <arr.length; i++){
            list.add(arr[i]);
        }
        int a = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <arr[a]) a=i;
        }
        if(answer.length == 0) {
            int[] ans = {-1};
            System.out.println(ans[0]);
            return ans;
        } else {
            list.remove(a);
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
                System.out.println(answer[i]);
            }
        }
        return answer;
    }
}
public class Programmers1_30 {
    public static void main(String[] args) {
        Solution30 sol = new Solution30();
        int[] arr = {1,2,3,4};
        sol.solution(arr);
    }
}
