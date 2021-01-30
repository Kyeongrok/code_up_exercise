class Solution_1 {
    public String solution(int[] numbers) {
        //string 배열로 바꾸고
        // index 0 1 2 가 있으면 각각 자리를 바꿔가며 해야하는데
        // 오름차순 정렬해서 제일 큰숫자 리턴
        String[] arr = new String[numbers.length];
        for(int i=0;i< numbers.length-1; i++) {
            String a = Integer.toString(numbers[i]);
            arr[i] = a;
        }

        String answer = "";
        return answer;
    }
}
public class Programmers2_01 {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        Solution_1 sol = new Solution_1();
        sol.solution(numbers);
    }
}
