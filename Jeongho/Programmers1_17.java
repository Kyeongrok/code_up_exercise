import java.util.Arrays;
import java.util.Collections;

class Solution17 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        return String.join("", arr);
    }
}
public class Programmers1_17 {
    public static void main(String[] args) {

    }
}
