package HelloWorld.Jeongho;
class Solution41 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        /*
        n = 길이
        arr1, arr2 이진수화 해서 그걸 읽어서 1일땐 "#", 0일땐 공백
        중복도 생각
         */
        String[] answer = new String[n];
        String a = "";
        String b = "";


        for(int i = 0; i < arr1.length; i++){
            String c = "";
            int id = 0;
            a = Integer.toBinaryString(arr1[i]);
           if(a.length() < 5) {
               while (a.length() + id < 5) {
                   c += "0";
                   id++;
               }
               c += a;
           }else{
               c = a;
           }
           answer[i] = c;
        }
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }


        return answer;
    }
}
public class Programmers1_41 {
    public static void main(String[] args) {
        Solution41 sol = new Solution41();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        sol.solution(n, arr1, arr2);
    }
}
