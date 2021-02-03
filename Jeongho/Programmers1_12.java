import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class Solution12 {
    public int[] solution(int[] arr, int divisor) {
        // 배열 받으면 divisor로 나눠떨어지는거 넣기
        // 오름차순 정렬
        LinkedList<Integer> list = new LinkedList<>();
        boolean ch = true;
        int a = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
                ch = false;
            }
        }
        if(ch){
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++){
             answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class Programmers1_12 {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        int[] arr = {3, 2, 6};
        int divisor = 10;
        sol.solution(arr, divisor);
    }
}
