import java.util.*;

class Solution_1 {
    //가장 큰 수
    public String solution(int[] numbers) {
        //string 배열로 바꾸고
        // index 0 1 2 가 있으면 각각 자리를 바꿔가며 해야하는데
        // 각각의 숫자를 arr[0]에 넣고 나머지 숫자 돌리기 // 팩토리얼로 조져야 할거 같은데..
        // 오름차순 정렬해서 제일 큰숫자 리턴
        String answer = "";
        String a = "";
        int[] ans = new int[numbers.length* (numbers.length-1)];
        int t =0;

        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a = Integer.toString(numbers[i]);
            arr[i] = a;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {// 젤 앞에 숫자 계속 바꿔주기

            String tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            for(int m = 0; m<arr.length-1;m++) { //총 arr.length-1만큼 밀어줘야함
                answer = "";
                 String temp = arr[arr.length-1];
                for (int j = arr.length-1; j >= 2; j--) {//한칸씩 밀기
                    arr[j] = arr[j-1];
                }
                arr[1] = temp;
                for (int p = 0; p < arr.length; p++) {
                    answer += arr[p];
                }

                ans[t] = Integer.parseInt(answer);
                t++;
                System.out.println(answer);
        }
            //System.out.println(answer);

    }
        Arrays.sort(ans);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        answer = Integer.toString(ans[ans.length-1]);
        System.out.println(answer);
        return answer;
    }
}
public class Programmers2_01 {
    public static void main(String[] args) {
        int[] numbers = {3,30,34,5,9};
        Solution_1 sol = new Solution_1();
        sol.solution(numbers);
    }
}
