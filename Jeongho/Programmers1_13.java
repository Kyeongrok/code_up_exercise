import java.util.*;
class Solution13 {
    public String[] solution(String[] strings, int n) {
        // 이중배열로 전환해서, 인덱스 추출해서 비교하고,
//        String[][] arr = new String[strings.length][];
//        for(int i = 0; i < strings.length; i++) {
//            for(int j = 0; j<strings[i].length(); j++) {
//                arr[i] = strings[i].split("");
//            }
//        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) > o2.charAt(n)){
                    return 1;
                } else if(o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                }else {
                    return -1;
                }
            }
        });
        String[] answer = {};
        return strings;
    }
}
public class Programmers1_13 {
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        String[] strings ={"sun", "bed", "car"};
        int n = 1;
        sol.solution(strings, n);
    }
}
