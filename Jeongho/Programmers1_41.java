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
           if(a.length() < 5) {// make arr1
               while (a.length() + id < 5) {
                   c += "0";
                   id++;
               }
               c += a;
           }else{
               c = a;
           }
           ans1[i] = c;
            if(b.length() < 5) { // make arr2
                while (b.length() + id2 < 5) {
                    d += "0";
                    id2++;
                }
                d += b;
            }else{
                d = b;
            }
            ans2[i] = d;
        }
//  하나씩 읽어서 1이면 바꿔주자
        for(int i = 0; i< n; i++){
            for(int j = 0;j< 5; j++) {
                if(ans1[i].charAt(j) == 0 && ans2[i].charAt(j) == 1){
                    ans1[i]= ans1[i].replace(ans1[i].charAt(j)+"", "1");
                }
            }
            answer[i] = ans1[i];
            System.out.println(ans1[i] +" "+ ans2[i]);
            System.out.println(answer[i]);
        }

        return ans1;
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
