package HelloWorld.Jeongho;

import java.awt.*;
import java.util.*;
import java.util.List;


class Solution1 {
    public int[] solution(int[] numbers) {
         /*
        1. numbers 받아서 i + (i+1)하고 answer배열에 넣기
        2. 중복제거
        3. 오름차순 정렬
       */
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                int t = (numbers[i]+numbers[j]);
                if(list.indexOf(t) < 0){//중복을 제거하기위해 더한 숫자의 인덱스에 값을 넣음
                    list.add(t);//그러면 중복이 발생했을때 그 해당인덱스에는 값이 존재하므로 if문을 들어오지못함
                }
            }
        }
        Collections.sort(list);
        int a = 0;//0으로 바꾸고 오름차순한다음에 0을 모두 없애준다

        int[] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
            System.out.print(answer[i]);
        }
        return answer;
    }
}
public class Programmers1_01 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] numbers = {1,1,1,1,11,1,1};
        sol.solution(numbers);
    }
}
