class Solution10 {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            System.out.println("answer길이 맞음");
            try {
                int a = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }else return false;
    }
//            char[] arrCh = s.toCharArray();
//            for(int i = 0 ; i< arrCh.length; i++) {
//                if (arrCh[i] >= 48 && arrCh[i] <= 57) {
//                    answer = true;
//                    System.out.println("answer안에 숫자만");
//                }else {
//                    System.out.println("answer안에 글자 있음");
//                    answer = false;
//                    System.out.println(answer);
//                    break;
//                }
//            }
//        }else{
//            answer = false;
//            System.out.println(answer);
//        }
}
public class Programmers1_10 {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        sol.solution("1245");
    }
}
