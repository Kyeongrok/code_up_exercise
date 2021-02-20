package HelloWorld.Jeongho;
class Solution41 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        /*
        n = 길이
        arr1, arr2 이진수화 해서 그걸 읽어서 1일땐 "#", 0일땐 공백
        중복도 생각
         */
        String[] ans1 = new String[n];
        String[] ans2 = new String[n];
        String[] answer = new String[n];
        String a = "";
        String b = "";
        for(int i = 0; i < arr1.length; i++){
            String c = "";
            String d = "";
            int id = 0;
            int id2 = 0;
            a = Integer.toBinaryString(arr1[i]);
            b = Integer.toBinaryString(arr2[i]);
           if(a.length() < n) {// make arr1
               while (a.length() + id < n) {
                   c += "0";
                   id++;
               }
               c += a;
           }else{
               c = a;
           }
           ans1[i] = c;
            if(b.length() < n) { // make arr2
                while (b.length() + id2 < n) {
                    d += "0";
                    id2++;
                }
                d += b;
            }else{
                d = b;
            }
            ans2[i] = d;
            String.
        }
//  하나씩 읽어서 1이면 바꿔주자
        for(int i = 0; i< n; i++){
            String tmp = ans1[i];
            for(int j = 0;j< n; j++) {
                if(ans1[i].charAt(j) == '0' && ans2[i].charAt(j) == '1'){
                    StringBuilder bld = new StringBuilder(ans1[i]);
                    bld.setCharAt(j,'1');
                    ans1[i] = bld.toString();

                }
            }
//            System.out.println(ans1[i]);
            answer[i] = ans1[i];
//            System.out.println(answer[i]);
        }
        for(int i =0; i < answer.length; i++){
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
            System.out.println(answer[i]);
        }
//        for(int i = 0; i < n; i++) {
//            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//            //비트연산 : 7 | 2 이면 00111 | 00001 일 때 하나라도 1이면 1, 아니면 0
//        }
//        for(int i = 0; i < n; i++) {
//            answer[i] = String.format("%" + n + "s", answer[i]); //n개의 자릿수만큼 문자열 담기
//            answer[i] = answer[i].replace("1", "#"); //answer[i]가 1이면 #으로 대체
//            answer[i] = answer[i].replace("0", " "); //answer[i]가 0이면 " "으로 대체
//        }
        return answer;
    }
}
public class Programmers1_41 {
    public static void main(String[] args) {
        Solution41 sol = new Solution41();
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        sol.solution(n, arr1, arr2);
    }
}
