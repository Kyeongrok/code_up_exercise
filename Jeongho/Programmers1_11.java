import java.util.*;

class Solution11 {
    public int[] solution(int []arr) {
        // 리스트에 널고, 돌리면 효율성 안됨
        // 한번에 해야함
        // 같으면 안넣어버리는 방식
        /*  LinkedList<Integer> list = new LinkedList<>();
        for(int i =0; i< arr.length; i++){
               list.add(arr[i]);
        }
        int a =0;
        while(a <list.size()-1){
            if (list.get(a) == list.get(a+1)) {
                list.remove(a+1);
            }else if(list.get(a) != list.get(a+1)){
                a++;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }*/
        ArrayList<Integer> list = new ArrayList<>();
        int a = 10;//조건이 0~9이기때문에 첫번째를 넣기위해
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != a){
                list.add(arr[i]);
                a = arr[i]; // a에 넣었던 값을 넣고 다음 값 비교
            }
        }
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }
}
public class Programmers1_11 {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int[] arr= {1,1,3,3,0,1,1};
        sol.solution(arr);
    }
}
